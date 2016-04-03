package com.egecius.demo_designpatterns.i_iterator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

final class Waitress {

	final ArrayList<Menu> menus = new ArrayList<>();

	public Waitress(final Menu... menus) {
		Collections.addAll(this.menus, menus);
	}

	void printMenus(){
		Iterator<Menu> iterator = menus.iterator();

		while (iterator.hasNext()) {
			printMenu(iterator);
		}
	}

	private void printMenu(final Iterator<Menu> iterator) {
		Menu menu = iterator.next();
		Iterator<MenuItem> menuItemIterator = menu.getIterator();
		while (menuItemIterator.hasNext()) {
			MenuItem item = menuItemIterator.next();
			System.out.println(item);
		}
		System.out.println("--- end of menu ---");
	}
}
