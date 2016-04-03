package com.egecius.demo_designpatterns.i_iterator;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link WaitressUsage}
 */
public class WaitressUsageTest {

	WaitressUsage usage;

	@Before
	public void setup() {
		usage = new WaitressUsage();
	}

	@Test
	public void printAllMenus() {
		usage.printAllMenus();

	}

	@Test
	public void printVeggieItems() {
		usage.printVegieItems();
	}

}