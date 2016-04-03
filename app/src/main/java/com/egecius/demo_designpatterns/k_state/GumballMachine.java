package com.egecius.demo_designpatterns.k_state;

final class GumballMachine {

	private static final int INITIAL_NUMBER_OF_GUMBALLS = 4;
	private static final State INITIAL_STATE = State.NO_QUARTER;

	private State state = INITIAL_STATE;
	private boolean isQuarterInserted;
	private int numberOfGumballsAvailable = INITIAL_NUMBER_OF_GUMBALLS;

	void onQuarterInserted() {
		isQuarterInserted = true;
		state = State.HAS_QUARTER;
	}

	void onGumballPurchased() {

		state = State.GUMBALL_SOLD;

		System.out.println("Dispensing gumball... here you go!");

		transitionToPostSoldState();
	}

	private void transitionToPostSoldState() {
		isQuarterInserted = false;
		numberOfGumballsAvailable--;

		if (numberOfGumballsAvailable > 0) {
			state = State.NO_QUARTER;
		} else {
			state = State.OUT_OF_BALLS;
		}
	}

	void onQuarterEjected() {
		isQuarterInserted = false;
		state = State.HAS_QUARTER;
	}


}
