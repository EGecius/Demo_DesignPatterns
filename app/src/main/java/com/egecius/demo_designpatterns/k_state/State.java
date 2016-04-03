package com.egecius.demo_designpatterns.k_state;

/**
 * One of the states that {@link GumballMachine} can be in.
 */
public enum State {

	NO_QUARTER {
		@Override
		void insertQuarter() {
			System.out.println("quarter inserted");
			machine.onQuarterInserted();
		}

		@Override
		void ejectQuarter() {
			System.out.println("you are trying to eject quarter but no quarter was inserted");
		}

		@Override
		void turnCrank() {
			System.out.println("you are turning a crank but you have to insert a quarter first");

		}
	},
	HAS_QUARTER {
		@Override
		void insertQuarter() {
			System.out.println("a quarter already inserted, giving this one back to you");
		}

		@Override
		void ejectQuarter() {
			System.out.println("ejecting quarter");
			machine.onQuarterEjected();
		}

		@Override
		void turnCrank() {
			System.out.println("crank turned");
			machine.onGumballPurchased();
		}
	},
	GUMBALL_SOLD {
		@Override
		void insertQuarter() {
			System.out.println("wait till your gumball is being dispensed");
		}

		@Override
		void ejectQuarter() {
			System.out.println("wait till your gumball is being dispensed");
		}

		@Override
		void turnCrank() {
			System.out.println("wait till your gumball is being dispensed");
		}
	},
	OUT_OF_BALLS {
		@Override
		void insertQuarter() {
			System.out.println("can't do anything. No gumballs left");
		}

		@Override
		void ejectQuarter() {
			System.out.println("can't do anything. No gumballs left");
		}

		@Override
		void turnCrank() {
			System.out.println("can't do anything. No gumballs left");
		}
	};

	private static GumballMachine machine;

	void setMachine(GumballMachine machine) {
		State.machine = machine;
	}


	/** user has injected a quarter coin */
	abstract void insertQuarter();

	/** user has pressed a button to eject a quarter */
	abstract void ejectQuarter();

	/** user has turned a buy a gumball that he has inserted a coin for */
	abstract void turnCrank();
}
