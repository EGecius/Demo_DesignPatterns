package com.egecius.demo_designpatterns.h_template;

public final class Latte extends CaffeineBeverage {

	@Override
	protected void brew() {
		System.out.println("brewing in special Latte way");
	}

	@Override
	protected void addCondiments() {
		System.out.println("adding sugar and extra foam for Latte");
	}
}
