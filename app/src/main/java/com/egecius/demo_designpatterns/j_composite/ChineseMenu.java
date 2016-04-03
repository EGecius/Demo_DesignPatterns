package com.egecius.demo_designpatterns.j_composite;


/**
 * Menu that returns an iterator
 */
final class ChineseMenu extends Menu {

	ChineseMenu() {
		addDefaults();
	}

	private void addDefaults() {
		add(new MenuItem("Black bean stir-fry", 8.00, true));
		add(new MenuItem("Chicken stir-fy", 9.00, false));
		add(new MenuItem("Tofu with rice", 7.00, true));
	}

	@Override
	public String toString() {
		return "\nChinese menu";
	}
}
