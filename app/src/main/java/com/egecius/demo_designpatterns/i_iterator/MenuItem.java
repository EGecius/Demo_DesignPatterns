package com.egecius.demo_designpatterns.i_iterator;

class MenuItem {

	final String title;
	final double price;
	final boolean isVegetarian;

	public MenuItem(final String title, final double price, final boolean isVegetarian) {
		this.title = title;
		this.price = price;
		this.isVegetarian = isVegetarian;
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
