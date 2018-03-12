/** Observer interface is implemented by all observers, 
 * so they all have to implement the update method
 * @author Priya Renjith
 */
public interface Observer {
  public void update(float temp, float humidity, float pressure);
}