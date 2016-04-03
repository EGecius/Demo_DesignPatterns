package com.egecius.demo_designpatterns.a_strategy.implementations.ducks;

import com.egecius.demo_designpatterns.a_strategy.implementations.behaviors.FlyWithWings;
import com.egecius.demo_designpatterns.a_strategy.implementations.behaviors.Quack;
import com.egecius.demo_designpatterns.a_strategy.interfaces.AbstractDuck;

/**
 * Duck that can both quack and fly
 */
public class QuackingFlyingDuck extends AbstractDuck {

	public QuackingFlyingDuck() {
		super(new Quack(), new FlyWithWings());
	}

}
