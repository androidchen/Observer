package com.org.observer.mine;

public class Main {

	public static void main(String[] args) {
		WeatherData data = new WeatherData();

		CurrentConditionDisplay display = new CurrentConditionDisplay(data);
		data.setMeasurements(88, 425, 53);
	}
}
