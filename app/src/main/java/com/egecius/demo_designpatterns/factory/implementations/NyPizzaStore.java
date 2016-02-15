package com.egecius.demo_designpatterns.factory.implementations;

import com.egecius.demo_designpatterns.factory.interfaces.Pizza;
import com.egecius.demo_designpatterns.factory.interfaces.PizzaStore;

public class NyPizzaStore implements PizzaStore {

	@Override
	public Pizza getPizza(String pizzaName) {

		if (pizzaName.equals("peperoni")) {
			return new NyPeperoniPizza();
		}

		return null;
	}
}
