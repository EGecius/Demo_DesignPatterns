package com.egecius.demo_designpatterns.a_strategy.implementations.ducks;

import com.egecius.demo_designpatterns.a_strategy.implementations.behaviors.FlyNoWings;
import com.egecius.demo_designpatterns.a_strategy.implementations.behaviors.MuteQuack;
import com.egecius.demo_designpatterns.a_strategy.interfaces.AbstractDuck;

/**
 * Duck that can't quack or fly
 */
public class SilentNoFlyDuck extends AbstractDuck {

	public SilentNoFlyDuck() {
		super(new MuteQuack(), new FlyNoWings());
	}

}
