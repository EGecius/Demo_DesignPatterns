package com.egecius.demo_designpatterns.k_state;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link GumballMachine}
 */
public class GumballMachineTest {

	GumballMachine machine;

	@Before
	public void setup() {
		machine = new GumballMachine();
	}

	@Test
	public void when__then() {
		//WHEN
		int balls = machine.getNumberOfBalls();
		boolean inserted = machine.hasQuarterInserted();
		//THEN
		assertThat(balls).isEqualTo(4);
		assertThat(inserted).isFalse();

		Outcome outcome = machine.turnCrank();
		assertThat(outcome).isEqualTo(Outcome.NONE);

		Outcome outcome1 = machine.insertQuarter();
		assertThat(outcome1).isEqualTo(Outcome.QUARTER_INSERTED);

		assertThat(outcome).isEqualTo(Outcome.NONE);
	}

}