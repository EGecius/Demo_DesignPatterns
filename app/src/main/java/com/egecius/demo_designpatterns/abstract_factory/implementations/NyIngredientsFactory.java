package com.egecius.demo_designpatterns.abstract_factory.implementations;

import com.egecius.demo_designpatterns.abstract_factory.interfaces.IngredientsFactory;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class NyIngredientsFactory implements IngredientsFactory {

	@Override
	public String getCheese() {
		return "NyCheese";
	}

	@Override
	public String getVeggies() {
		return "NyVeggies";
	}
}
