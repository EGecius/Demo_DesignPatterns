package com.egecius.demo_designpatterns.f_command.my_attempt;

import com.egecius.demo_designpatterns.f_command.my_attempt.interfaces.Invoker;

final public class Customer {

	private final Invoker invoker;

	public Customer(final Invoker invoker) {
		this.invoker = invoker;
	}

	public void orderLunch() {
		invoker.takeOrder(new LunchOrder());
	}

}
