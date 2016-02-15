package com.egecius.demo_designpatterns.abstract_factory.implementations;

import com.egecius.demo_designpatterns.abstract_factory.interfaces.IngredientsFactory;
import com.egecius.demo_designpatterns.abstract_factory.interfaces.Pizza;
import com.egecius.demo_designpatterns.abstract_factory.interfaces.PizzaStore;


public class NyPizzaStore implements PizzaStore {

	private IngredientsFactory ingredientsFactory = new NyIngredientsFactory();

	@Override
	public Pizza getPizza(String pizzaName) {
		if (pizzaName.equals("peperoni")) {
			return new PeperoniPizza(ingredientsFactory);
		}


		return null;
	}

}
