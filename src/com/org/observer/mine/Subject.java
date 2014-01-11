package com.org.observer.mine;

/**
 * 1.题对象管理某些数据；
 * 2.当主题内的数据改变，就会通知观察者；
 * 3.一旦数据改变，新的数据会以某种方式到达观察者手上；
 */
public interface Subject {

	public void registerObserver(Observer obs);

	public void removeObserver(Observer obs);

	public void notifyObservers();

}
