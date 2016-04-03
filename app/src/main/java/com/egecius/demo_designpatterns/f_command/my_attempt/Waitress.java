package com.egecius.demo_designpatterns.f_command.my_attempt;

import com.egecius.demo_designpatterns.f_command.my_attempt.interfaces.Command;
import com.egecius.demo_designpatterns.f_command.my_attempt.interfaces.Invoker;
import com.egecius.demo_designpatterns.f_command.my_attempt.interfaces.Receiver;

final public  class Waitress implements Invoker {

	private final Receiver receiver;

	public Waitress(final Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void takeOrder(final Command command) {
		receiver.fulfillOrder(command);
	}
}
