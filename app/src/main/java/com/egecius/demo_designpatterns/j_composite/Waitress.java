package com.egecius.demo_designpatterns.j_composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * //todo
 */
final class Waitress {

	private final List<Menu> menus = new ArrayList<>();

	public Waitress(final Menu... menus) {
		Collections.addAll(this.menus, menus);
	}

	void printMenus(){
		for (final Menu menu : menus) {
			printMenu(menu);
		}
	}

	private void printMenu(final Menu menu) {
		Iterator<? extends MenuComponent> iterator = menu.iterator();

		while (iterator.hasNext()) {
			MenuComponent component = iterator.next();
			System.out.println(component);
		}

		System.out.println("--- end of menu ---");
	}
}
