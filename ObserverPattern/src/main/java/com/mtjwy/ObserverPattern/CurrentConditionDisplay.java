package com.mtjwy.ObserverPattern;

public class CurrentConditionDisplay implements Observer, Display {
	
	private Subject weatherData;
	
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
		
	}
	
}
