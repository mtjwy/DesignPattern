package com.mtjwy.DecoratorPattern;

public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;//holding the component we are wrapping
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
 
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		
		return 0.2 + beverage.cost();
	}

}
