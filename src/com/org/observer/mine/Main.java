package com.org.observer.mine;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData data = new WeatherData();

		CurrentConditionDisplay display = new CurrentConditionDisplay(data);
		StaticsDisplay staticsDisplay = new StaticsDisplay(data);

		data.setMeasurements(88, 425, 53);
		data.setMeasurements(888, 4255, 533);
	}
}
