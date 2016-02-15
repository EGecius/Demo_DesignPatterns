package com.egecius.demo_designpatterns.decorator.implementations;

import com.egecius.demo_designpatterns.decorator.intefaces.Beverage;
import com.egecius.demo_designpatterns.decorator.intefaces.CondimentDecorator;

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
