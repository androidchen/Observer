package com.org.observer.mine;

/**
 * 观察者已经订阅主题，以便在主题数据改变的时候能够收到更新
 */
public interface Observer {

	public void update(float temp, float humitity, float presure);
}
