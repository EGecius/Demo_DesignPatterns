package com.egecius.demo_designpatterns.i_iterator;

final class WaitressUsage {

	void printAllMenus() {
		Waitress waitress = new Waitress(new ChineseMenu(), new IndianMenu());
		waitress.printMenus();
	}

	void printVegieItems() {
		Waitress waitress = new Waitress(new ChineseMenu(), new IndianMenu());
		waitress.printVeggieItems();
	}


}
