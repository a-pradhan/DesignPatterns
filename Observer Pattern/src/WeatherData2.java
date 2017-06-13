import java.util.Observable;

// Using Java's default Observable class to implement the observer pattern
// See WeatherData example before looking at this
public class WeatherData2 extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData2() {
		// no need to create a data structure to hold observers
		// this is managed by the Observable supertype
	}
	
	public void measurementsChanged() {
		// denotes whether the state has changed, notifyObservers() only signals observers if the inherited "changed" flag is true
		// can be used to provide more flexibility as to when observers are notified
		setChanged(); 
		
		// no data object passed as an argument as a PULL style model is used by observers to get state
		notifyObservers();
		
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
