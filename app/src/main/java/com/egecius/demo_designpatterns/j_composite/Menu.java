package com.egecius.demo_designpatterns.j_composite;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * //todo
 */
final class Menu implements MenuComponent {

	private ArrayList<MenuItem> menuItems = new ArrayList<>();

	@Override
	public Iterator<MenuComponent> iterator() {
		return menuItems.iterator();
	}
}
