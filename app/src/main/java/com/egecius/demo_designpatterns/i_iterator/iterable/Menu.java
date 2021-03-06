package com.egecius.demo_designpatterns.i_iterator.iterable;

import java.util.Iterator;

/**
 * Represents a menu in a restaurant. It returns an iterator which allows easily iterating over its contents
 */
interface Menu extends Iterable<MenuItem> {
}
