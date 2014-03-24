public class Time1 {

  private int _hour, _minute, _second;

  /**
   * Constructing the class with time defined by you.
   *
   * @param h
   *  Represent the hour of the time.
   * @param m
   *  Represent the minute of the time.
   * @param s
   *  Represent the seconds of the time.
   */
  public Time1(int h, int m, int s) {
  }

  /**
   * Constructing the class with a Time1 object.
   *
   * @param other
   *  An object from the instance of Time1.
   */
  public Time1(Time1 other) {
  }

  /**
   * Return the hour of the time.
   */
  public int getHour() {
    return _hour;
  }

  /**
   * Return the minute of the time.
   */
  public int getMinute() {
    return this._minute;
  }

  /**
   * Return the seconds of the time.
   */
  public int getSeconds() {
    return this._second;
  }

  /**
   * Set the hour of the time.
   *
   * @param num
   *  Integer which represent the hour. Allowed value is between 0 to 23.
   */
  public void setHour(int num) {
    if (num >= 0 && num <= 23) {
      this._hour = num;
    }
  }

  /**
   * Set the minute of the time.
   *
   * @param num
   *  Integer which represent the minute. Allowed value is between 0 to 59.
   */
  public void setMinute(int num) {
    if (num >= 0 && num <= 59) {
      this._hour = num;
    }
  }

  /**
   * Set the seconds of the time.
   *
   * @param num
   *  Integer which represent the seconds. Allowed value is between 0 to 59.
   */
  public void setSecond(int num) {
    if (num >= 0 && num <= 59) {
      this._second = num;
    }
  }

  /**
   * Get the time object in a string format.
   */
  public String toString() {
    return "";
  }

  /**
   * Check if the provided time and the time in the current instance are equals.
   *
   * @param other
   *  An object from the instance of Time1.
   */
  public boolean equals(Time1 other) {
    return true;
  }

  /**
   * Check if the time in the current instance occur before the given time.
   *
   * @param other
   *  An object from the instance of Time1.
   */
  public boolean before(Time1 other) {
    return true;
  }

  /**
   * Check if the time in the current instance occur after the given time.
   *
   * @param other
   *  An object from the instance of Time1.
   */
  public boolean after(Time1 other) {
    return true;
  }

  /**
   * Return the difference in seconds between the given time and the time in the
   * instance.
   *
   * @param other
   *  An object from the instance of Time1.
   */
  public int difference(Time1 other) {
    return 0;
  }
}
