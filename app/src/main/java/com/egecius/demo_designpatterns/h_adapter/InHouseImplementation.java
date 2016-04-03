package com.egecius.demo_designpatterns.h_adapter;

/**
 * //todo
 */
final class InHouseImplementation implements OurPlayerInterface {
	@Override
	public void play() {
		System.out.println("playing in-house player");
	}
}
