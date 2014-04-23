public class BusStop {

  public BusStop() {
  }

  public BusStop(int size) {
  }

  public BusArrival[] getBusses() {
    BusArrival[] bus;
    bus = new BusArrival[3];
    return bus;
  }

  public boolean addLine(int line, int pass, Time1 t) {
    return true;
  }

  public void removeAllLine() {
  }

  public int getPopularLine() {
    return 1;
  }

  public long getAverageTime() {
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
