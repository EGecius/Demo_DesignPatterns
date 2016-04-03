package com.egecius.demo_designpatterns.f_command.my_attempt.usage;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link CommandPatternUsage}
 */
public class CommandPatternUsageTest {

	CommandPatternUsage usage;

	@Before
	public void setup() {
		usage = new CommandPatternUsage();
	}

	@Test
	public void when__then() {
		//WHEN
		usage.demo();

		//THEN

	}

}