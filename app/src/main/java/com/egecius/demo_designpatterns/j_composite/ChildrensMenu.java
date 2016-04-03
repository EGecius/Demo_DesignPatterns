package com.egecius.demo_designpatterns.j_composite;


final class ChildrensMenu extends Menu {

	public ChildrensMenu() {
		addDefaults();
	}

	private void addDefaults() {
		add(new MenuItem("pancakes", 7.00, true));
		add(new MenuItem("ice cream", 5.00, true));
	}

	@Override
	public String toString() {
		return "\nChildren's menu";
	}
}
