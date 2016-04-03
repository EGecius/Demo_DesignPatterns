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

	/* NO_QUARTER STATE */

	@Test
	public void when__then() {

		/** 1) insertQuarter */

		//PRE-CONDITIONS
		assertThat(machine.getState()).isEqualTo(State.NO_QUARTER);
		assertThat(machine.getNumberOfBalls()).isEqualTo(4);

		//NO-outcome actions
		assertThat(machine.turnCrank()).isEqualTo(Outcome.NONE);
		assertThat(machine.ejectQuarter()).isEqualTo(Outcome.NONE);

		//outcome action
		assertThat(machine.insertQuarter()).isEqualTo(Outcome.QUARTER_INSERTED);

		//POST-CONDITIONS
		assertThat(machine.getState()).isEqualTo(State.HAS_QUARTER);
		assertThat(machine.getNumberOfBalls()).isEqualTo(4);
	}

	/* HAS_QUARTER  1) eject quarter  */

	@Test
	public void given_HAS_QUARTER_when_ejectQuarter() {
		//getting into HAS_QUARTER state
		hasQuarterPreparation();

		//outcome action
		assertThat(machine.ejectQuarter()).isEqualTo(Outcome.QUARTER_EJECTED);

		//POST-CONDITIONS
		assertThat(machine.getState()).isEqualTo(State.NO_QUARTER);
		assertThat(machine.getNumberOfBalls()).isEqualTo(4);
	}

	/* HAS_QUARTER 2) turn crank */

	@Test
	public void given_HAS_QUARTER_when_turnCrank() {
		//getting into HAS_QUARTER state
		hasQuarterPreparation();

		//outcome action
		assertThat(machine.turnCrank()).isEqualTo(Outcome.GUMBALL_SOLD);

		//POST-CONDITIONS
		assertThat(machine.getState()).isEqualTo(State.NO_QUARTER);
		assertThat(machine.getNumberOfBalls()).isEqualTo(3);
	}

	private void hasQuarterPreparation() {
		machine.insertQuarter();

		//PRE-CONDITIONS
		assertThat(machine.getState()).isEqualTo(State.HAS_QUARTER);
		assertThat(machine.getNumberOfBalls()).isEqualTo(4);

		//NO-outcome actions
		assertThat(machine.insertQuarter()).isEqualTo(Outcome.NONE);
	}


	/* GUMBALL_SOLD */

		/* this state only lasts af ew milliseconds so we can't get into it*/

	/* OUT_OF_BALLS */

	@Test
	public void given_OUT_OF_BALLS_then() {
		purchaseAllBalls();

		//PRE-CONDITIONS
		assertThat(machine.getState()).isEqualTo(State.OUT_OF_BALLS);

		//NO-outcome actions
		assertThat(machine.insertQuarter()).isEqualTo(Outcome.NONE);
		assertThat(machine.turnCrank()).isEqualTo(Outcome.NONE);
		assertThat(machine.ejectQuarter()).isEqualTo(Outcome.NONE);
	}

	private void purchaseAllBalls() {
		for (int i = 0; i < 4; i++) {
			machine.insertQuarter();
			machine.turnCrank();
		}
	}

}