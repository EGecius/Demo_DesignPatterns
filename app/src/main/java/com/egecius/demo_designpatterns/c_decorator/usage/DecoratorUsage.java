package com.egecius.demo_designpatterns.c_decorator.usage;

import com.egecius.demo_designpatterns.c_decorator.implementations.Espresso;
import com.egecius.demo_designpatterns.c_decorator.implementations.Milk;
import com.egecius.demo_designpatterns.c_decorator.implementations.Whip;
import com.egecius.demo_designpatterns.c_decorator.intefaces.Beverage;

/**
 * Example of how to use code written with a decorator design pattern
 */
public class DecoratorUsage {

	public Beverage getEspressoWithMilkAndWhip() {
		return new Milk(new Whip(new Espresso()));
	}

}
