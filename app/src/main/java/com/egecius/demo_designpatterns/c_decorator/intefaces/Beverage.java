package com.egecius.demo_designpatterns.c_decorator.intefaces;

/**
 * Defines a type of a beverage
 */
public interface Beverage {

	/** Returns cost of a beverage in pounds, e.g. £1.00 */
	double getCost();

	String getName();
}
