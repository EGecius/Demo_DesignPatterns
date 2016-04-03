package com.egecius.demo_designpatterns.a_strategy.implementations.behaviors;

import android.util.Log;

import com.egecius.demo_designpatterns.a_strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		Log.v("Eg:MuteQuack:13", "silent quack");
	}

}
