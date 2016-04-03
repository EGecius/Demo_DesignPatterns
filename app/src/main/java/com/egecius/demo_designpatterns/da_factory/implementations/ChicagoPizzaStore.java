package com.egecius.demo_designpatterns.da_factory.implementations;

import com.egecius.demo_designpatterns.da_factory.interfaces.Pizza;
import com.egecius.demo_designpatterns.da_factory.interfaces.PizzaStore;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class ChicagoPizzaStore implements PizzaStore {

	@Override
	public Pizza getPizza(String pizzaName) {

		if (pizzaName.equals("peperoni")) {
			return new ChicagoPeperoniPizza();
		}


		return null;
	}
}
