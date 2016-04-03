package com.egecius.demo_designpatterns.j_composite;

import java.util.Iterator;

/**
 * Empty iterator to be returned by items that have nothing to iterate
 */
final class EmptyIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("nothing to remove since it is EmptyIterator");
	}
}
