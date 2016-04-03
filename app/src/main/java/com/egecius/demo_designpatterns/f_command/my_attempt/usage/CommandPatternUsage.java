package com.egecius.demo_designpatterns.f_command.my_attempt.usage;

import com.egecius.demo_designpatterns.f_command.my_attempt.Cook;
import com.egecius.demo_designpatterns.f_command.my_attempt.Customer;
import com.egecius.demo_designpatterns.f_command.my_attempt.Waitress;

final class CommandPatternUsage {

	void demo() {
		Cook cook = new Cook();
		Waitress waitress = new Waitress(cook);
		Customer customer = new Customer(waitress);
		customer.orderLunch();
	}
}
