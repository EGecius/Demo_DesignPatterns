package com.egecius.demo_designpatterns.h_adapter;

final class Adapter implements OurPlayerInterface {

	ThirdPartyPlayer thirdPartyPlayer;

	public Adapter(final ThirdPartyPlayer thirdPartyPlayer) {
		this.thirdPartyPlayer = thirdPartyPlayer;
	}

	@Override
	public void play() {
		thirdPartyPlayer.playThirdParty();
	}
}
