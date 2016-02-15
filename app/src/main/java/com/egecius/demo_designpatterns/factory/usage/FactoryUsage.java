package com.egecius.demo_designpatterns.factory.usage;

import com.egecius.demo_designpatterns.factory.implementations.ChicagoPizzaStore;
import com.egecius.demo_designpatterns.factory.implementations.NyPizzaStore;

public class FactoryUsage {

	ChicagoPizzaStore getChicagoPizzaStore() {
		return new ChicagoPizzaStore();
	}

	NyPizzaStore getNyPizzaStore() {
		return new NyPizzaStore();
	}

}
