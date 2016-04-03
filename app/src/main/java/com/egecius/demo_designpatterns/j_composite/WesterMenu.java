package com.egecius.demo_designpatterns.j_composite;

final class WesterMenu extends Menu {

	public WesterMenu() {
		addDefaults();
	}

	private void addDefaults() {
		add(new MenuItem("chicken soup", 5.50, false));
		add(new MenuItem("mashed potatoes", 6.00, true));
	}
}
