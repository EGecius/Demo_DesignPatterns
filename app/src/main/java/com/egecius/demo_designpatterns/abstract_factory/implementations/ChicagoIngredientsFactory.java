package com.egecius.demo_designpatterns.abstract_factory.implementations;

import com.egecius.demo_designpatterns.abstract_factory.interfaces.IngredientsFactory;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class ChicagoIngredientsFactory implements IngredientsFactory {
	@Override
	public String getCheese() {
		return "ChicagoCheese";
	}

	@Override
	public String getVeggies() {
		return "ChicagoVeggies";
	}
}
