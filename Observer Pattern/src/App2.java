/*
 * Uses Java's Observable class and Observable interface to implement the observer pattern
 * WeatherData2 class is the subject and extends the java.util.Observable class
 * CurrentConditionsDisplay2 class is the observer and implements the java.util.Observer interface
 */

public class App2 {
	public static void main(String[] args) {
		WeatherData2 weatherData = new WeatherData2();
		CurrentConditionsDisplay2 currentConditions = new CurrentConditionsDisplay2(weatherData);
		
		weatherData.setMeasurements(80, 49, 32);
		weatherData.setMeasurements(83.4f, 50.6f, 32.3f);
		
		weatherData.deleteObserver(currentConditions);
		System.out.println("De-registerd observer from observable");
		
		weatherData.setMeasurements(60, 32, 78);
		System.out.println("End of data feed");
	
	}

}
