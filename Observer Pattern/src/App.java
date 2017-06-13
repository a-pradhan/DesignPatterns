/*
 * Using custom Subject and Observer interfaces to implement the observer interface.
 * CurrentConditionsDisplay class is the observer and is dependent on the 
 * WeatherData class, which is the subject
 */ 
public class App {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		currentConditions.display();
		
		// updating state of subject: weatherData notifies the observer: currentConditions 
		// updated values are printed out to console using the update method in the CurrentConditionsDisplay class
		weatherData.setMeasurements(80.0f, 67.3f, 40);
		weatherData.setMeasurements(81.2f, 79.2f, 39.8f);
		
		//de-register observer from subject
		weatherData.removeObserver(currentConditions);
		System.out.println("Stopped observing");
		
		weatherData.setMeasurements(90.2f,45,32);
		System.out.println("End of data feed");
		
		
	}
}
