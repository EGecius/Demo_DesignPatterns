package com.egecius.demo_designpatterns.decorator.usage;

import com.egecius.demo_designpatterns.decorator.implementations.Espresso;
import com.egecius.demo_designpatterns.decorator.implementations.Milk;
import com.egecius.demo_designpatterns.decorator.implementations.Whip;
import com.egecius.demo_designpatterns.decorator.intefaces.Beverage;

/**
 * Example of how to use code written with a decorator design pattern
 */
public class DecoratorUsage {

	public Beverage getEspressoWithMilkAndWhip() {
		return new Milk(new Whip(new Espresso()));
	}

}
