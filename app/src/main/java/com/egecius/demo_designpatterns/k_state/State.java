package com.egecius.demo_designpatterns.k_state;

/**
 * One of the states that {@link GumballMachine} can be in.
 */
enum State implements GumballMachineInterface {

	NO_QUARTER {
		@Override
		public Outcome insertQuarter() {
			System.out.println("quarter inserted");
			return Outcome.QUARTER_INSERTED;
		}

		@Override
		public Outcome ejectQuarter() {
			System.out.println("you are trying to eject quarter but no quarter was inserted");
			return Outcome.NONE;
		}

		@Override
		public Outcome turnCrank() {
			System.out.println("you are turning a crank but you have to insert a quarter first");
			return Outcome.NONE;

		}
	},
	HAS_QUARTER {
		@Override
		public Outcome insertQuarter() {
			System.out.println("a quarter already inserted, giving this one back to you");
			return Outcome.NONE;
		}

		@Override
		public Outcome ejectQuarter() {
			System.out.println("ejecting quarter");
			return Outcome.QUARTER_EJECTED;
		}

		@Override
		public Outcome turnCrank() {
			System.out.println("crank turned");
			return Outcome.GUMBALL_SOLD;
		}
	},
	GUMBALL_SOLD {
		@Override
		public Outcome insertQuarter() {
			System.out.println("wait till your gumball is being dispensed");
			return Outcome.NONE;
		}

		@Override
		public Outcome ejectQuarter() {
			System.out.println("wait till your gumball is being dispensed");
			return Outcome.NONE;
		}

		@Override
		public Outcome turnCrank() {
			System.out.println("wait till your gumball is being dispensed");
			return Outcome.NONE;
		}
	},
	OUT_OF_BALLS {
		@Override
		public Outcome insertQuarter() {
			System.out.println("can't do anything. No gumballs left");
			return Outcome.NONE;
		}

		@Override
		public Outcome ejectQuarter() {
			System.out.println("can't do anything. No gumballs left");
			return Outcome.NONE;
		}

		@Override
		public Outcome turnCrank() {
			System.out.println("can't do anything. No gumballs left");
			return Outcome.NONE;
		}
	}

}
