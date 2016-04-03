package com.egecius.demo_designpatterns.da_factory.implementations;

import com.egecius.demo_designpatterns.da_factory.interfaces.Pizza;

public class ChicagoPeperoniPizza implements Pizza {

	@Override
	public String getDescription() {
		return "ChicagoPeperoniPizza";
	}

}
