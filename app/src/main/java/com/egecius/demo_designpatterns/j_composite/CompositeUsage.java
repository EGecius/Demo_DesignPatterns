package com.egecius.demo_designpatterns.j_composite;

final class CompositeUsage {

	void demo() {
		ChineseMenu chineseMenu = new ChineseMenu();
		WesternMenu westernMenu = new WesternMenu();
		Waitress waitress = new Waitress(chineseMenu, westernMenu);
		waitress.printMenus();
	}
}
