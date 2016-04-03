package com.egecius.demo_designpatterns.k_state;

final class GumballMachine implements GumballMachineInterface {

	private static final int INITIAL_NUMBER_OF_GUMBALLS = 4;
	private static final State INITIAL_STATE = State.NO_QUARTER;

	private State state = INITIAL_STATE;
	private int numberOfGumballsAvailable = INITIAL_NUMBER_OF_GUMBALLS;

	private void onQuarterInserted() {
		state = State.HAS_QUARTER;
	}

	private void onGumballSold() {
		state = State.GUMBALL_SOLD;
		System.out.println("Dispensing gumball... here you go!");
		transitionToPostSoldState();
	}

	private void transitionToPostSoldState() {
		numberOfGumballsAvailable--;

		if (numberOfGumballsAvailable > 0) {
			state = State.NO_QUARTER;
		} else {
			state = State.OUT_OF_BALLS;
		}
	}

	private void onQuarterEjected() {
		state = State.NO_QUARTER;
	}

	private void processOutcome(final Outcome outcome) {
		switch (outcome) {
			case QUARTER_INSERTED:
				onQuarterInserted();
				return;
			case QUARTER_EJECTED:
				onQuarterEjected();
				return;
			case GUMBALL_SOLD:
				onGumballSold();
				return;
			case NONE:
				return;
			default:
				throw new IllegalStateException("unrecognized state");
		}
	}

	@Override
	public Outcome insertQuarter() {
		Outcome outcome = state.insertQuarter();
		processOutcome(outcome);
		return outcome;
	}

	@Override
	public Outcome ejectQuarter() {
		Outcome outcome = state.ejectQuarter();
		processOutcome(outcome);
		return outcome;
	}

	@Override
	public Outcome turnCrank() {
		Outcome outcome = state.turnCrank();
		processOutcome(outcome);
		return outcome;
	}

	public int getNumberOfBalls() {
		return numberOfGumballsAvailable;
	}

	public State getState() {
		return state;
	}
}
