package com.egecius.demo_designpatterns.i_iterator.standard;

import java.util.Iterator;

/**
 * Represents a menu in a restaurant. It returns an iterator which allows easily iterating over its contents
 */
interface Menu {

	Iterator<MenuItem> getIterator();
}
