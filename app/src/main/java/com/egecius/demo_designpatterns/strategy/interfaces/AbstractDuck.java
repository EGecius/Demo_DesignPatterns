package com.egecius.demo_designpatterns.strategy.interfaces;

public abstract class AbstractDuck {

	private final QuackBehavior quackBehavior;
	private final FlyBehavior flyBehavior;

	protected AbstractDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;
	}

	void quack() {
		quackBehavior.quack();
	}

	void fly() {
		flyBehavior.fly();
	}

}
