package com.egecius.demo_designpatterns.h_template;

/** The Template method defines the steps of an algorithm and allows subclasses to provide implementation
 * for one or more steps.  */
abstract class CaffeineBeverage {

	public void prepare(){
		pourWater();
		brew();
		pourInCup();
		if (isCustomerWantsCondiments()) {
			addCondiments();
		}
	}


	private void pourWater() {
		System.out.println("pouring water");
	}
	protected abstract void brew();

	private void pourInCup() {
		System.out.println("pouring into cup");
	}

	protected abstract void addCondiments();

	/** Represents a hook for a template pattern */
	protected abstract boolean isCustomerWantsCondiments();

}
