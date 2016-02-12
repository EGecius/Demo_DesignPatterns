package com.egecius.demo_designpatterns.strategy.implementations.behaviors;

import android.util.Log;

import com.egecius.demo_designpatterns.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		Log.v("Eg:FlyWithWings:13", "fly with wings");
	}
}
