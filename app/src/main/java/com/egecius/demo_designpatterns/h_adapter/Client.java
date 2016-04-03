package com.egecius.demo_designpatterns.h_adapter;

/**
 * //todo
 */
final class Client {

	private final OurPlayerInterface player;

	Client(final OurPlayerInterface player) {
		this.player = player;
	}

	void demo() {
		player.play();
	}

}

