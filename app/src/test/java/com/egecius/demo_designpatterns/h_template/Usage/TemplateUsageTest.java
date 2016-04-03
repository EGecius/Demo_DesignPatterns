package com.egecius.demo_designpatterns.h_template.Usage;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link TemplateUsage}
 */
public class TemplateUsageTest {

	TemplateUsage usage;

	@Before
	public void setup() {
		usage = new TemplateUsage();
	}

	@Test
	public void demo() {
		usage.demo();
	}

}