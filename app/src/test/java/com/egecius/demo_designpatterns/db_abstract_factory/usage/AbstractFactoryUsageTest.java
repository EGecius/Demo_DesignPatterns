package com.egecius.demo_designpatterns.db_abstract_factory.usage;


import com.egecius.demo_designpatterns.db_abstract_factory.interfaces.Pizza;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Single Responsibility:
 *
 * Tests for {@link AbstractFactoryUsage}
 */
public class AbstractFactoryUsageTest {

	AbstractFactoryUsage usage;

	@Before
	public void setup() {
		usage = new AbstractFactoryUsage();
	}

	@Test
	public void when__then() {
		//WHEN
		Pizza peperoni = usage.getPizzaStore().getPizza("peperoni");


		//THEN
		assertThat(peperoni.getDescription()).isEqualTo("Peperoni with NyCheese, NyVeggies");

	}

}