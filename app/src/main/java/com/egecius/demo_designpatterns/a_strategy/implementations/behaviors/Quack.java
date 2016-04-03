package com.egecius.demo_designpatterns.a_strategy.implementations.behaviors;

import android.util.Log;

import com.egecius.demo_designpatterns.a_strategy.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		Log.v("Eg:Quack:14", "quack ");
	}

}
