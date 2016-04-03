package com.egecius.demo_designpatterns.h_adapter;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link AdapterUsageDemo}
 */
public class AdapterUsageDemoTest {

	AdapterUsageDemo demo;

	@Before
	public void setup() {
		demo = new AdapterUsageDemo();
	}

	@Test
	public void demoAdapterThirdParty() {
		demo.demoAdapterThirdParty();
	}

	@Test
	public void demoInHouseImplementation() {
		demo.demoInHouseImplementation();
	}


}