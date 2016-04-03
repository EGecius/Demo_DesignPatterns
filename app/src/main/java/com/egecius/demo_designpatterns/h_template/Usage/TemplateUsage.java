package com.egecius.demo_designpatterns.h_template.Usage;

import com.egecius.demo_designpatterns.h_template.Cappuccino;
import com.egecius.demo_designpatterns.h_template.Latte;

final class TemplateUsage {

	void demo() {
		Cappuccino cappuccino = new Cappuccino();
		cappuccino.prepare();

		Latte latte = new Latte();
		latte.prepare();
	}
}
