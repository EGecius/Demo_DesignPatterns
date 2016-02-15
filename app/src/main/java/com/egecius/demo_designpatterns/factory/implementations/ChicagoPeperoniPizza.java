package com.egecius.demo_designpatterns.factory.implementations;

import com.egecius.demo_designpatterns.factory.interfaces.Pizza;

public class ChicagoPeperoniPizza implements Pizza {

	@Override
	public String getDescription() {
		return "ChicagoPeperoniPizza";
	}

}
