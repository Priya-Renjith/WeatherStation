/**
 * Weather Station test application
 * 
 * @author Priya Renjith
 *
 */

public class WeatherStation {
  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData(); // creates the WeatherData object

    // create the display element and pass the WeatherData object
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurements(80f, 65f, 30.4f);
    weatherData.setMeasurements(82f, 70f, 29.2f);
    weatherData.setMeasurements(78f, 90f, 29.2f);

  }
}
