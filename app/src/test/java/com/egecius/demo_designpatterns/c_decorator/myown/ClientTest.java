package com.egecius.demo_designpatterns.c_decorator.myown;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ClientTest {

    private Client mSut;

    @Captor
    ArgumentCaptor<CallbackFramework.Callback> mCallbackCaptor;
    private CallbackFrameworkWrapper mCallbackFrameworkWrapper;

    @Test
    public void connectsToBluetoothWithMocks() {
        givenUsingMockCallbackFrameworkWrapper();
        assertThat(mSut.hasConnectedToBluetooth()).isFalse();

        mSut.connectToBluetooth();
        whenCallbackReturnsSuccess();

        assertThat(mSut.hasConnectedToBluetooth()).isTrue();
    }

    private void givenUsingMockCallbackFrameworkWrapper() {
        mCallbackFrameworkWrapper = mock(CallbackFrameworkWrapper.class);
        mSut = new Client(mCallbackFrameworkWrapper);
    }

    private void whenCallbackReturnsSuccess() {
        verify(mCallbackFrameworkWrapper).callExternally(mCallbackCaptor.capture());
        mCallbackCaptor.getValue().onSuccess();
    }

    @Test
    public void connectsToBluetoothWithRealObjects() {
        givenUsingRealCallbackFrameworkWrapper();
        assertThat(mSut.hasConnectedToBluetooth()).isFalse();

        mSut.connectToBluetooth();

        assertThat(mSut.hasConnectedToBluetooth()).isTrue();
    }

    private void givenUsingRealCallbackFrameworkWrapper() {
        mCallbackFrameworkWrapper = new CallbackFrameworkWrapper(new FakeCallbackFramework());
        mSut = new Client(mCallbackFrameworkWrapper);
    }

    private class FakeCallbackFramework extends CallbackFramework {
        @Override
        public void callExternally(CallbackFramework.Callback callback) {
            callback.onSuccess();
        }
    }
}