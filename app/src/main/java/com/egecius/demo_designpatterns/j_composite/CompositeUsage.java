package com.egecius.demo_designpatterns.j_composite;

final class CompositeUsage {

	void printMenus() {
		ChineseMenu chineseMenu = new ChineseMenu();
		WesternMenu westernMenu = new WesternMenu();
		Waitress waitress = new Waitress(chineseMenu, westernMenu);
		waitress.printMenus();
	}

	void printVeggieItems() {
		ChineseMenu chineseMenu = new ChineseMenu();
		WesternMenu westernMenu = new WesternMenu();
		Waitress waitress = new Waitress(chineseMenu, westernMenu);
		waitress.printVeggieItems();
	}
}
