package com.egecius.demo_designpatterns.i_iterator.iterable;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link Iterable_WaitressUsage}
 */
public class Iterable_WaitressUsageTest {

	Iterable_WaitressUsage usage;

	@Before
	public void setup() {
		usage = new Iterable_WaitressUsage();
	}

	@Test
	public void printVegieItems() {
		usage.printVegieItems();
	}

	@Test
	public void printAllMenus() {
		usage.printAllMenus();
	}

}