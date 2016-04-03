package com.egecius.demo_designpatterns.f_command.my_attempt;

import com.egecius.demo_designpatterns.f_command.my_attempt.interfaces.Command;

/**
 * //todo
 */
final public class LunchOrder implements Command {

	@Override
	public void execute() {
		System.out.print("making lunch");
	}

}
