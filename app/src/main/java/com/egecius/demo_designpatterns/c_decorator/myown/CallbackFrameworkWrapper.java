package com.egecius.demo_designpatterns.c_decorator.myown;


/** This is to show whether a wrapper can work with a delegate that returns via a callback */
public class CallbackFrameworkWrapper implements CallbackFrameworkInteface {

    private final CallbackFramework mCallbackFramework;

    public CallbackFrameworkWrapper(
            CallbackFramework callbackFramework) {
        mCallbackFramework = callbackFramework;
    }

    @Override
    public void callExternally(CallbackFramework.Callback callback) {
        mCallbackFramework.callExternally(callback);
    }
}
