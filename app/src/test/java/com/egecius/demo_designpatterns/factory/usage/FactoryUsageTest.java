package com.egecius.demo_designpatterns.factory.usage;

import com.egecius.demo_designpatterns.factory.interfaces.Pizza;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryUsageTest {

	FactoryUsage usage;

	@Before
	public void setup() {
		usage = new FactoryUsage();
	}

	@Test
	public void when_peperoniPizzaOrderedFromChicago_then_nameIsCorrect() {
		//WHEN
		Pizza peperoni = usage.getChicagoPizzaStore().getPizza("peperoni");

		//THEN
		assertThat(peperoni.getDescription()).isEqualTo("ChicagoPeperoniPizza");
	}

	@Test
	public void when_peperoniPizzaOrderedFromNy_then_nameIsCorrect() {
		//WHEN
		Pizza peperoni = usage.getNyPizzaStore().getPizza("peperoni");
		//THEN
		assertThat(peperoni.getDescription()).isEqualTo("NyPeperoniPizza");
	}

}