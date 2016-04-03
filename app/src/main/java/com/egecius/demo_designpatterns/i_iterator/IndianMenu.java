package com.egecius.demo_designpatterns.i_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu that returns an iterator
 */
final class IndianMenu implements Menu {

	private final ArrayList<MenuItem> menu = new ArrayList<>();

	IndianMenu() {
		addDefaults();
	}

	private void addDefaults() {
		menu.add(new MenuItem("Chicken curry", 8.50, false));
		menu.add(new MenuItem("veg curry", 8.00, true));
	}

	@Override
	public Iterator<MenuItem> getIterator() {
		return menu.iterator();
	}

}
