/** Subject Interface for the Weather Station application
* @author Priya Renjith
**/
public interface Subject {
  public void registerObserver(Observer o); 
  public void removeObserver(Observer o); 
  public void notifyObservers();
}
