package com.egecius.demo_designpatterns.c_decorator.implementations;

import com.egecius.demo_designpatterns.c_decorator.intefaces.Beverage;
import com.egecius.demo_designpatterns.c_decorator.intefaces.CondimentDecorator;

/**
 * Decorates beverage
 */
public class Milk implements CondimentDecorator {

	private final Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double getCost() {
		return beverage.getCost() + .20;
	}

	@Override
	public String getName() {
		return beverage.getName() + ", milk";
	}

}
