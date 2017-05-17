package cn.daemon.design.observer;

import java.util.Observable;

public class CurrentConditionsDisplayEx implements java.util.Observer,DisplayElement{
	
	private Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplayEx(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {
		System.err.println("Current condition:" + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherDataEx){
			WeatherDataEx weatherDataEx = (WeatherDataEx) o;
			this.humidity = weatherDataEx.getHumidity();
			this.temperature = weatherDataEx.getTemperature();
			display();
		}
	}

}
