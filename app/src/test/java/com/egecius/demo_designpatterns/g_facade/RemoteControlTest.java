package com.egecius.demo_designpatterns.g_facade;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link RemoteControl}
 */
public class RemoteControlTest {

	RemoteControl remoteControl;

	@Before
	public void setup() {
		remoteControl = new RemoteControl(new DVD_Player(), new LightsController(), new Projector());
	}

	@Test
	public void when__then() {
		remoteControl.play();
	}

}