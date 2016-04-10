package com.egecius.demo_designpatterns.j_composite;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link CompositeUsage}
 */
public class CompositeUsageTest {

	CompositeUsage usage;

	@Before
	public void setup() {
		usage = new CompositeUsage();
	}

	@Test
	public void when__then() {
		//WHEN
		usage.printMenus();
	}

	@Test
	public void printVeggieItems() {
		usage.printVeggieItems();
	}

}