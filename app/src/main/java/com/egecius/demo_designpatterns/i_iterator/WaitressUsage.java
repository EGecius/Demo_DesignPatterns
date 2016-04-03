package com.egecius.demo_designpatterns.i_iterator;

final class WaitressUsage {

	void demo() {
		Waitress waitress = new Waitress(new ChineseMenu(), new IndianMenu());
		waitress.printMenus();
	}

}
