package com.org.observer.mine;

public class StaticsDisplay implements Observer, DisplayElement {

	private float temprature;
	private float humidity;

	public StaticsDisplay(Subject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("StaticsDisplay : " + temprature + " + " + humidity);
	}

	@Override
	public void update(float temp, float humitity, float presure) {
		this.temprature = temp;
		this.humidity = humitity;
		display();
	}

}
