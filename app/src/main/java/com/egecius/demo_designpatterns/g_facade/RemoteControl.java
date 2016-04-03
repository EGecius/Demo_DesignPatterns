package com.egecius.demo_designpatterns.g_facade;

/**
 * This is facade that simplifies usage of many other classes.
 *
 * It pretends to be a remote for a home theatre.
 * Here with a single method call you can call many
 * underlying methods
 */
final class RemoteControl {

	final DVD_Player dvdPlayer;
	final LightsController lightsController;
	final Projector projector;

	public RemoteControl(final DVD_Player dvdPlayer, final LightsController lightsController, final Projector projector) {
		this.dvdPlayer = dvdPlayer;
		this.lightsController = lightsController;
		this.projector = projector;
	}

	void play() {
		lightsController.lightsOff();
		projector.turnOn();
		dvdPlayer.play();
	}
}
