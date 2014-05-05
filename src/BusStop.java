public class BusStop {

  /**
   * Holds the all buses arrival information.
   */
  private BusArrival[] _buses;

  /**
   * Holds the actual number of buses.
   */
  private int _noOfBuses;

  /**
   * Holds the maximum number of buses.
   */
  final int MAX_BUSES_NUMBER = 1000;

  /**
   * Constructing the class with default values.
   */
  public BusStop() {
    this._buses = new BusArrival[MAX_BUSES_NUMBER];
    this._noOfBuses = 0;
  }

  /**
   * Constructing the class with known number of buses.
   *
   * @param size
   *  The size of buses.
   */
  public BusStop(int size) {
    this._noOfBuses = size;
    this._buses = new BusArrival[size];
  }

  /**
   * Return the array of arrivals.
   */
  public BusArrival[] getBuses() {
    BusArrival[] buses = new BusArrival[this._noOfBuses];

    for (int i = 0; i < this._noOfBuses; i++) {
      buses[i] = this._buses[i];
    }

    return buses;
  }

  /**
   * @return the number of buses.
   */
  public int getNoOfBuses() {
    int busesNum;
    busesNum = this._noOfBuses;
    return busesNum;
  }

  /**
   * Adding a bus to the bus arrival array.
   * @param line
   *  The line number.
   * @param pass
   *  The passengers number.
   * @param t
   *  The time object.
   *
   * @return Bool
   *  Return true/false if the adding of the bus succeeded.
   */
  public boolean add(int line, int pass, Time1 t) {
    if (this._noOfBuses >= MAX_BUSES_NUMBER) {
      // Whoops! no place in the arrives array.
      return false;
    }

    this._buses[this._noOfBuses] = new BusArrival(line, pass, t);
    this._noOfBuses++;
    return true;
  }

  /**
   * Remove any bus arrival of a given line number.
   *
   * @param line
   *  The line number we need to exclude.
   */
  public void removeAllLine(int line) {
    // Create a new array which holds all the buses without the specific line.
    BusArrival[] busesWithOutLine = new BusArrival[this._buses.length];
    int j = 0;

    for (int i = 0; i < this._noOfBuses; i++) {
      if (this._buses[i].getLineNum() == line) {
        continue;
      }

      busesWithOutLine[j] = new BusArrival(this._buses[i]);
      j++;
    }

    if (j != 0) {
      this._buses = busesWithOutLine;
      this._noOfBuses = j;
    }
  }

  /**
   * @return the popular line number.
   */
  public int getPopularLine() {
    if (this._buses.length == 0) {
      return 0;
    }

    int[] busesInstancesNumber = new int[100];
    int popularLine = this._buses[0].getLineNum();

    for (int i = 0; i < this._noOfBuses; i++) {
      // Increase the appearance of the line number.
      busesInstancesNumber[this._buses[i].getLineNum()]++;
    }

    for (int i = 0; i < busesInstancesNumber.length; i++) {
      // Find the most popular line.
      popularLine = busesInstancesNumber[i] > busesInstancesNumber[popularLine] ? i : popularLine;
    }

    return popularLine;
  }

  /**
   * @return the amount of average time need to pass until any bus will arrive
   * to the station.
   */
  public long getAverageTime() {
    // Get the first bus as a minimum and maximum.
    BusArrival min = this._buses[0];
    BusArrival max = this._buses[0];

    // Starting from the second array since checking if the first array after or
    // before it self is redundant.
    for (int i = 1; i < this._noOfBuses; i++) {
      min = this._buses[i].before(min) ? this._buses[i] : min;
      max = !this._buses[i].before(max) ? this._buses[i] : max;
    }

    long diff = min.getArrivalTime().difference(max.getArrivalTime());

    return diff / (this._noOfBuses - 1);
  }

  /**
   * @return the amount of passengers that been in the station during the day.
   */
  public int totalPassengers() {
    int passengers = 0;

    for (int i = 0; i < this._noOfBuses; i++) {
      passengers += this._buses[i].getNoOfPass();
    }

    return passengers;
  }

  /**
   * Check which bus is the most populate one between all of the buses which
   * arrived to the station.
   *
   * @return BusArrival
   *  The most populated bus.
   */
  public BusArrival maxPassengers() {
    BusArrival mostPopulatedBusLine = this._buses[0];

    for (int i = 0; i < this._noOfBuses; i++) {
      // Find the most popular line.
      mostPopulatedBusLine = this._buses[i].getNoOfPass() > mostPopulatedBusLine.getNoOfPass() ? this._buses[i] : mostPopulatedBusLine;
    }

    return new BusArrival(mostPopulatedBusLine);
  }

  /**
   * @return A string which represent the current object.
   */
  public String toString() {
    String string = "";

    for (int i = 0; i < this._noOfBuses; i++) {
      string += this._buses[i] + "\n";
    }
    return string;
  }
}
