package com.org.observer.mine;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temprature;
	private float humidity;
	private float presure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		int index = observers.indexOf(obs);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer obs = (Observer) observers.get(i);
			obs.update(temprature, humidity, presure);
		}
	}

	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temprature, float humitity, float presure) {
		this.temprature = temprature;
		this.humidity = humitity;
		this.presure = presure;
		measurementChanged();
	}
}
