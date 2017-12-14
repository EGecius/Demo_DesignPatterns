package com.egecius.demo_designpatterns.c_decorator.myown;

public class Client {

    private final CallbackFrameworkWrapper mCallbackFrameworkWrapper;

    private boolean hasConnectedToBluetooth = false;

    public Client(
            CallbackFrameworkWrapper callbackFrameworkWrapper) {
        mCallbackFrameworkWrapper = callbackFrameworkWrapper;
    }

    void connectToBluetooth() {
        mCallbackFrameworkWrapper.callExternally(new CallbackFramework.Callback() {
            @Override
            public void onSuccess() {
                hasConnectedToBluetooth = true;
            }
        });
    }

    public boolean hasConnectedToBluetooth() {
        return hasConnectedToBluetooth;
    }
}
