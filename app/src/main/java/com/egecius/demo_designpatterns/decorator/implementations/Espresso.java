package com.egecius.demo_designpatterns.decorator.implementations;

import com.egecius.demo_designpatterns.decorator.intefaces.Beverage;

public class Espresso implements Beverage {

	@Override
	public double getCost() {
		return 1.00;
	}

	@Override
	public String getName() {
		return "Espresso";
	}

}
