package com.egecius.demo_designpatterns.i_iterator.iterable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu that returns an iterator
 */
final class ChineseMenu implements Menu {

	private final ArrayList<MenuItem> menu = new ArrayList<>();

	ChineseMenu() {
		addDefaults();
	}

	private void addDefaults() {
		menu.add(new MenuItem("Black bean stir-fry", 8.00, true));
		menu.add(new MenuItem("Chicken stir-fy", 9.00, false));
		menu.add(new MenuItem("Tofu with rice", 7.00, true));
	}

	@Override
	public Iterator<MenuItem> getIterator() {
		return menu.iterator();
	}

}
