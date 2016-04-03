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
			printComponentRecursively(menu);
		}
	}

	void printVeggieItems(){
		for (final Menu menu : menus) {
			printVeggieComponentRecursively(menu);
		}
	}

	private void printComponentRecursively(final MenuComponent component) {

		System.out.println(component);

		Iterator<? extends MenuComponent> iterator = component.iterator();
		while (iterator.hasNext()) {
			MenuComponent innerComponent = iterator.next();
			printComponentRecursively(innerComponent);
		}
	}

	private void printVeggieComponentRecursively(final MenuComponent component) {

		if (component.isSuitableForVegetarians()) {
			System.out.println(component);
		}

		Iterator<? extends MenuComponent> iterator = component.iterator();
		while (iterator.hasNext()) {
			MenuComponent innerComponent = iterator.next();
			printVeggieComponentRecursively(innerComponent);
		}
	}

}
