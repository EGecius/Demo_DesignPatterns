package com.egecius.demo_designpatterns.k_state;

/**
 * Represent action a user can take on Gumball machine
 */
interface GumballMachineInterface {

	/** user has injected a quarter coin */
	Outcome insertQuarter();

	/** user has pressed a button to eject a quarter */
	Outcome ejectQuarter();

	/** user has turned a buy a gumball that he has inserted a coin for */
	Outcome turnCrank();
}
