public class BusStop {

  /**
   * Holds the all buses arrival information.
   */
  BusArrival [] _buses;

  /**
   * Holds the actual number of buses.
   */
  int _noOfBuses;

  /**
   * Holds the maximum number of buses.
   */
  final int MAX_BUSES_NUMBER = 1000;

  /**
   * Constructing the class with default values.
   */
  public BusStop() {
  }

  /**
   * Constructing the class with known number of buses.
   *
   * @param size
   *  The size of buses.
   */
  public BusStop(int size) {
  }

  public BusArrival[] getBusses() {
    BusArrival[] bus;
    bus = new BusArrival[3];
    return bus;
  }

  public boolean add(int line, int pass, Time1 t) {
    return true;
  }

  public void removeAllLine(int line) {
  }

  public int getPopularLine() {
    return 1;
  }

  public long getAverageTime() {
    return 1;
  }

  public int getNoOfBuses() {
    return 1;
  }

  public int totalPassengers() {
    return 1;
  }

  public BusArrival maxPassengers() {
    return new BusArrival(1,2,1,3,4);
  }

  public String toString() {
    return "";
  }
}
