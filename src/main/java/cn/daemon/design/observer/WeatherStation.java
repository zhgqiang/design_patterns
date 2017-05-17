package cn.daemon.design.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(1, 4, 7);
		weatherData.setMeasurements(2, 5, 8);
		weatherData.setMeasurements(3, 6, 9);
		
		WeatherDataEx weatherDataEx = new WeatherDataEx();
		weatherDataEx.setMeasurements(11, 14, 17);
		CurrentConditionsDisplayEx conditionsDisplayEx = new CurrentConditionsDisplayEx(weatherDataEx);
		conditionsDisplayEx.update(weatherDataEx, args);
	}
}
