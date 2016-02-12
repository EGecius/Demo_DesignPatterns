package com.egecius.demo_designpatterns.strategy.implementations.behaviors;

import android.util.Log;

import com.egecius.demo_designpatterns.strategy.interfaces.FlyBehavior;

public class FlyNoWings implements FlyBehavior {
	@Override
	public void fly() {
		Log.v("Eg:FlyNoWings:13", "fly no wings");
	}
}
