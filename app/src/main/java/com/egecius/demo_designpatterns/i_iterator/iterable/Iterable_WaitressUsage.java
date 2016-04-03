package com.egecius.demo_designpatterns.i_iterator.iterable;

final class Iterable_WaitressUsage {

	void printAllMenus() {
		Waitress waitress = new Waitress(new ChineseMenu(), new IndianMenu());
		waitress.printMenus();
	}

	void printVegieItems() {
		Waitress waitress = new Waitress(new ChineseMenu(), new IndianMenu());
		waitress.printVeggieItems();
	}


}
