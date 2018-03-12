/**
 * This display element implements Observer so that it can get changes from WeatherData object. It
 * also implements DisplayElement interface.
 * 
 * @author Priya Renjith
 *
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("Current Conditions: " + this.temperature + "F Degrees and " + this.humidity
        + "% humidity");
  }
}
