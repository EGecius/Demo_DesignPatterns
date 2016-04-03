package com.egecius.demo_designpatterns.d_factory.usage;

import com.egecius.demo_designpatterns.d_factory.implementations.ChicagoPizzaStore;
import com.egecius.demo_designpatterns.d_factory.implementations.NyPizzaStore;

public class FactoryUsage {

	ChicagoPizzaStore getChicagoPizzaStore() {
		return new ChicagoPizzaStore();
	}

	NyPizzaStore getNyPizzaStore() {
		return new NyPizzaStore();
	}

}
