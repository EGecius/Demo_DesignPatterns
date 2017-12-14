package com.egecius.demo_designpatterns.c_decorator.myown;

public class CallbackFramework implements CallbackFrameworkInteface {

    public static final String FROM_CALLBACK_FRAMEWORK = "from CallbackFramework";

    interface Callback {

        void onSuccess();
    }

    @Override
    public void callExternally(Callback callback) {
        callback.onSuccess();
    }
}
