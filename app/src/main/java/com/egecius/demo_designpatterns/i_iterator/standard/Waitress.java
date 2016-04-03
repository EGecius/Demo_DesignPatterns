package com.egecius.demo_designpatterns.i_iterator.standard;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

final class Waitress {

	private final ArrayList<Menu> menus = new ArrayList<>();

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
			print(item);
		}
		System.out.println("--- end of menu ---");
	}

	private void print(final MenuItem item) {
		System.out.println(item);
	}

	public void printVeggieItems() {
		for (final Menu menu : menus) {
			printVeggieItems(menu);
		}
	}

	private void printVeggieItems(final Menu menu) {
		Iterator<MenuItem> iterator = menu.getIterator();
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isVegetarian) {
				print(menuItem);
			}
		}
	}
}
