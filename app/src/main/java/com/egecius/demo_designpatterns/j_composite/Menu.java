package com.egecius.demo_designpatterns.j_composite;


import java.util.ArrayList;
import java.util.Iterator;

class Menu implements MenuComponent {

	private ArrayList<MenuItem> menuItems = new ArrayList<>();

	public void add(MenuItem item) {
		menuItems.add(item);
	}

	@Override
	public Iterator<? extends MenuComponent> iterator() {
		return menuItems.iterator();
	}

}
