package com.egecius.demo_designpatterns.c_decorator.implementations;

import com.egecius.demo_designpatterns.c_decorator.intefaces.Beverage;
import com.egecius.demo_designpatterns.c_decorator.intefaces.CondimentDecorator;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class Whip implements CondimentDecorator {

	private final Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 0.30;
	}

	@Override
	public String getName() {
		return beverage.getName() + ", whip";
	}
}
