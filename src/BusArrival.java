public class BusArrival {

  /**
   * The number line. Allowed range between 1 to 99.
   */
  private int _lineNumber;

  /**
   * Arrival time of the bus.
   */
  private Time1 _arrivalTime;

  /**
   * Holds the number of passengers in the bus.
   */
  private int _noOsPassengers;

  /**
   * Constricting the object with known hours of arrival.
   *
   * @param lineNumber
   *  The number of the line.
   * @param pass
   *  The number of passengers.
   * @param h
   *  The hour the bus should arrive to the station.
   * @param m
   *  The minute the bus should arrive to the the station.
   * @param s
   *  The seconds the bus should arrive to the station.
   */
  public BusArrival(int lineNumber, int pass, int h, int m, int s) {
    this.setLineNumber(lineNumber);
    this.setNoOsPassengers(pass);
    this._arrivalTime = new Time1(h, m, s);
  }

  /**
   * Constricting the object with Time1 objects passed.
   *
   * @param lineNumber
   *  The number of the line.
   * @param pass
   *  The number of passengers.
   * @param t
   *  An object of the Time1 instance.
   */
  public BusArrival(int lineNumber, int pass, Time1 t) {
    this.setLineNumber(lineNumber);
    this.setNoOsPassengers(pass);
    this.setArrivalTime(t);
  }

  /**
   * Constricting the object with BusArrival object.
   */
  public BusArrival(BusArrival other) {
    this.setLineNumber(other.getLineNumber());
    this.setNoOsPassengers(other.getNoOsPassengers());
    this._arrivalTime = new Time1(other.getArrivalTime());
  }

  /**
   * Get the arrival time.
   */
  public Time1 getArrivalTime() {
    return this._arrivalTime;
  }

  /**
   * Set the arrival time.
   * @param t
   *  Time1 object.
   */
  public void setArrivalTime(Time1 t) {
    this._arrivalTime = new Time1(t);
  }

  /**
   * Get the line number.
   */
  public int getLineNumber() {
    return this._lineNumber;
  }

  /**
   * Set the line number
   *
   * @param num
   *  The line number.
   */
  public void setLineNumber(int num) {
    this._lineNumber = num;
  }

  /**
   * Get the number of passengers.
   */
  public int getNoOsPassengers() {
    return this._noOsPassengers;
  }

  /**
   * Set the number of passengers.
   *
   * @param num
   *  Number of passengers.
   */
  public void setNoOsPassengers(int num) {
    this._noOsPassengers = num;
  }

  /**
   * Determine of the given BusArrival object and the current instance of
   * BusArrival are equals.
   */
  public boolean equals(BusArrival other) {
    return false;
  }

  /**
   * Present to the user the current instance in a string presentation.
   */
  public String toString() {
    return "Bus no. " + this._lineNumber + " arrived at " + this._arrivalTime.toString() + " with " + this._noOsPassengers;
  }

  /**
   * Determine if the current bus is fuller then the given bus object.
   */
  public boolean fuller(BusArrival other) {
    return true;
  }

  /**
   * Determine if the current bus arrived before the given time object.
   */
  public boolean before(BusArrival other) {
    return true;
  }

  /**
   * Determine if the bus is full.
   */
  public boolean isFull() {
    return true;
  }

  /**
   * Return the number of full minutes difference between the arrival of the
   * buses to the station.
   */
  public int elapssedTime(BusArrival other) {
    return 2;
  }
}
