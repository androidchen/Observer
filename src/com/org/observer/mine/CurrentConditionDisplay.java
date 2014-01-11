package com.org.observer.mine;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temprature;
	private float humidity;

	// private Subject subject;

	public CurrentConditionDisplay(Subject subject) {
		// this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(float temprature, float humitity, float presure) {
		this.temprature = temprature;
		this.humidity = humitity;
		display();
	}

	@Override
	public void display() {
		System.out.println("CurrentCondition : temprature:" + temprature + ",humidity:" + humidity);
	}
}
