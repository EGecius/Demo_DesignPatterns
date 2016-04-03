package com.egecius.demo_designpatterns.i_iterator.iterable;


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
		for (final MenuItem item : menu) {
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
		for (final MenuItem menuItem : menu) {
			if (menuItem.isVegetarian) {
				print(menuItem);
			}
		}
	}
}
