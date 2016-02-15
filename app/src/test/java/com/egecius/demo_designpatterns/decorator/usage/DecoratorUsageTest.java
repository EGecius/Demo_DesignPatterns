package com.egecius.demo_designpatterns.decorator.usage;

import com.egecius.demo_designpatterns.decorator.intefaces.Beverage;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Single Responsibility:
 *
 * Tests for {@link DecoratorUsage}
 */
public class DecoratorUsageTest {

	DecoratorUsage usage;

	@Before
	public void setup() {
		usage = new DecoratorUsage();
	}

	@Test
	public void when_getEspressoWithMilkAndWhipCalled_thenPriceAndNameAreCorrect() {
		//WHEN
		Beverage espressoWithMilkAndWhip = usage.getEspressoWithMilkAndWhip();

		//THEN
		assertThat(espressoWithMilkAndWhip.getCost()).isEqualTo(1.5);
		assertThat(espressoWithMilkAndWhip.getName()).isEqualTo("Espresso, whip, milk");
	}

}