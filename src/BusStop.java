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
    this._noOfBuses = MAX_BUSES_NUMBER;
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
  public BusArrival[] getBusses() {
    BusArrival[] buses = new BusArrival[this._noOfBuses];

    for (int i = 0; i < this._noOfBuses; i++) {
      buses[i] = this._buses[i];
    }

    return buses;
  }

  /**
   * Return the number of buses.
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
   *  Return true/false if the adding of the bus succesded.
   */
  public boolean add(int line, int pass, Time1 t) {
    if (this._buses.length >= MAX_BUSES_NUMBER) {
      // Whoops! no place in the arrives array.
      return false;
    }

    this._buses[this._buses.length + 1] = new BusArrival(line, pass, t);
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

    for (int i = 0; i < this._noOfBuses; i++) {
      if (this._buses[i].getLineNum() == line) {
        continue;
      }

      // todo: handle blank holes.
      busesWithOutLine[i] = this._buses[i];
    }
  }

  /**
   * Return the popular line number.
   */
  public int getPopularLine() {
    if (this._buses.length == 0) {
      return 0;
    }

    int[] busesInstancesNumber = new int[100];
    int popularLine = this._buses[0].getLineNum();

    for (int i = 0; i < this._buses.length; i++) {
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
   *
   */
  public long getAverageTime() {
    return 1;
  }

  /**
   *
   * @return
   */
  public int totalPassengers() {
    return 1;
  }

  /**
   *
   * @return
   */
  public BusArrival maxPassengers() {
    return new BusArrival(1,2,1,3,4);
  }

  /**
   *
   * @return
   */
  public String toString() {
    String string = "";

    for (int i = 0; i < this._buses.length; i++) {
      string += this._buses[i].toString() + "\n";
    }
    return string;
  }
}
