package com.egecius.demo_designpatterns.j_composite;

final class CompositeUsage {

	void demo() {

		ChineseMenu chineseMenu = new ChineseMenu();
		Waitress waitress = new Waitress(chineseMenu);
		waitress.printMenus();
	}
}
