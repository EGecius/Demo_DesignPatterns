package com.egecius.demo_designpatterns.db_abstract_factory.usage;

import com.egecius.demo_designpatterns.db_abstract_factory.implementations.NyPizzaStore;

public class AbstractFactoryUsage {

	NyPizzaStore getPizzaStore() {
		return new NyPizzaStore();
	}

}
