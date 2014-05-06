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
  private int _noOfPassengers;

  /**
   * Holds the maximum number of passengers in a single bus.
   */
  final int MAX_PASSENGERS_NUMBER = 70;

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
    this.setLineNum(lineNumber);
    this.setNoOfPass(pass);
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
    this.setLineNum(lineNumber);
    this.setNoOfPass(pass);
    this.setArrivalTime(t);
  }

  /**
   * Constricting the object with BusArrival object.
   */
  public BusArrival(BusArrival other) {
    this.setLineNum(other.getLineNum());
    this.setNoOfPass(other.getNoOfPass());
    this._arrivalTime = new Time1(other.getArrivalTime());
  }

  /**
   * Get the arrival time.
   *
   * @return Time1
   *  Return an object from the instance of Time1 which will represent the
   *  arrival time.
   */
  public Time1 getArrivalTime() {
    return this._arrivalTime;
  }

  /**
   * Set the arrival time.
   *
   * @param t
   *  Time1 object.
   */
  public void setArrivalTime(Time1 t) {
    this._arrivalTime = new Time1(t);
  }

  /**
   * Get the line number.
   *
   * @return int
   *  Return the line number.
   */
  public int getLineNum() {
    return this._lineNumber;
  }

  /**
   * Set the line number
   *
   * @param num
   *  The line number.
   */
  public void setLineNum(int num) {
    if (num < 1 || num > 99) {
      System.out.println("The line number can be only between 1 to 99.");
      return;
    }

    this._lineNumber = num;
  }

  /**
   * Get the number of passengers.
   *
   * @return int
   *  Get the number of passengers.
   */
  public int getNoOfPass() {
    return this._noOfPassengers;
  }

  /**
   * Set the number of passengers.
   *
   * @param num
   *  Number of passengers.
   */
  public void setNoOfPass(int num) {
    if (num < 0 || num > MAX_PASSENGERS_NUMBER) {
      System.out.println("The number of passengers can be between 0 to " + MAX_PASSENGERS_NUMBER + ".");
      return;
    }

    this._noOfPassengers = num;
  }

  /**
   * Determine of the given BusArrival object and the current instance of
   * BusArrival are equals.
   *
   * @return boolean
   *  Return true/false if the properties are equal to the given object.
   */
  public boolean equals(BusArrival other) {
    return this._lineNumber == other.getLineNum() && this._arrivalTime.equals(other.getArrivalTime()) && this._noOfPassengers == other.getNoOfPass();
  }

  /**
   * Present to the user the current instance in a string presentation.
   *
   * @return String
   *  Return a string which provide info about the object.
   */
  public String toString() {
    return "Bus no. " + this._lineNumber + " arrived at " + this._arrivalTime.toString() + " with " + this._noOfPassengers + " passengers";
  }

  /**
   * Determine if the current bus is fuller then the given bus object.
   *
   * @return boolean
   *  Return true/false if the current bus is fuller then the given bus object.
   */
  public boolean fuller(BusArrival other) {
    return this._noOfPassengers > other.getNoOfPass();
  }

  /**
   * Determine if the current bus arrived before the given bus object.
   *
   * @param other
   *  A BusArrival instance which represent the other second arriving bus.
   *
   * @return boolean
   *  Return true/false if the current bus arrived before the given bus.
   */
  public boolean before(BusArrival other) {
    return this._arrivalTime.before(other.getArrivalTime());
  }

  /**
   * Determine if the bus is full.
   *
   * @return bool
   *  Return true/false if the bus if full.
   */
  public boolean isFull() {
    return this._noOfPassengers > MAX_PASSENGERS_NUMBER;
  }

  /**
   * Return the number of full minutes difference between the arrival of the
   * buses to the station.
   *
   * @return bool
   *  Return the minutes difference between the arrival of the buses to the
   *  station.
   */
  public int elapsedTime(BusArrival other) {
    int seconds = this._arrivalTime.difference(other.getArrivalTime());

    return seconds / 60;
  }
}
