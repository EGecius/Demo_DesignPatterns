package com.egecius.demo_designpatterns.f_command.my_attempt;

import com.egecius.demo_designpatterns.f_command.my_attempt.interfaces.Command;
import com.egecius.demo_designpatterns.f_command.my_attempt.interfaces.Receiver;

final public class Cook implements Receiver {

	@Override
	public void fulfillOrder(final Command command) {
		command.execute();
	}
}
