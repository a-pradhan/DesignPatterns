import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
	private Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay2(Observable ob) {
		observable = ob;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(Observable o, Object arg) {
		if(arg== null) {
			// no data structure provided to method
			temperature = ((WeatherData2) o).getTemperature();
			humidity = ((WeatherData2) o).getHumidity();
			display();
		} else {
			// code to make use of a data structure object if supplied 
			
		}
		
		
	}



}
