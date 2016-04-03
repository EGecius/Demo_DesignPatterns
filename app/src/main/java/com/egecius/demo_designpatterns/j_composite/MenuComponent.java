package com.egecius.demo_designpatterns.j_composite;

import java.util.Iterator;

interface MenuComponent {

	Iterator<? extends MenuComponent> iterator();
}
