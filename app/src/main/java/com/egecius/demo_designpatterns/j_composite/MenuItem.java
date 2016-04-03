package com.egecius.demo_designpatterns.j_composite;

import java.util.Iterator;

/**
 * Menu item, such as pancakes
 */
final class MenuItem implements MenuComponent {

	final String title;
	final double price;
	final boolean isVegetarian;

	public MenuItem(final String title, final double price, final boolean isVegetarian) {
		this.title = title;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}

	@Override
	public Iterator<? extends MenuComponent> iterator() {
		return new EmptyIterator();
	}

	@Override
	public String toString() {
		return "MenuItem{" +
				"title='" + title + '\'' +
				", price=" + price +
				", isVegetarian=" + isVegetarian +
				'}';
	}
}
