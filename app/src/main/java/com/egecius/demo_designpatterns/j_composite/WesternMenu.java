package com.egecius.demo_designpatterns.j_composite;

final class WesternMenu extends Menu {

	public WesternMenu() {
		addDefaults();
	}

	private void addDefaults() {
		add(new MenuItem("chicken soup", 5.50, false));
		add(new MenuItem("cepelinai with meat", 6.00, false));
		add(new ChildrensMenu());
	}

	@Override
	public String toString() {
		return "\nWestern menu";
	}

	@Override
	public boolean isSuitableForVegetarians() {
		return false;
	}
}
