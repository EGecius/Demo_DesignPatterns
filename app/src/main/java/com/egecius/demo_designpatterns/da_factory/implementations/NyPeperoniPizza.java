package com.egecius.demo_designpatterns.da_factory.implementations;

import com.egecius.demo_designpatterns.da_factory.interfaces.Pizza;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class NyPeperoniPizza implements Pizza {

	@Override
	public String getDescription() {
		return "NyPeperoniPizza";
	}

}
