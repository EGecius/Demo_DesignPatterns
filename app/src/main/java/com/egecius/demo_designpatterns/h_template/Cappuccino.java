package com.egecius.demo_designpatterns.h_template;

public final class Cappuccino extends CaffeineBeverage {

	@Override
	protected void brew() {
		System.out.println("brewing in special Cappuccino way");
	}

	@Override
	protected void addCondiments() {
		System.out.println("adding sugar and cinnamon");
	}

	@Override
	protected boolean isCustomerWantsCondiments() {
		return true;
	}
}
