package com.egecius.demo_designpatterns.abstract_factory.implementations;

import com.egecius.demo_designpatterns.abstract_factory.interfaces.IngredientsFactory;
import com.egecius.demo_designpatterns.abstract_factory.interfaces.Pizza;

public class PeperoniPizza implements Pizza {

	private String description;

	public PeperoniPizza(IngredientsFactory ingredientsFactory) {
		prepare(ingredientsFactory);
	}

	private void prepare(IngredientsFactory ingredients) {
		description = "Peperoni with " + ingredients.getCheese() + ", " + ingredients.getVeggies();
	}


	@Override
	public String getDescription() {
		return description;
	}

}
