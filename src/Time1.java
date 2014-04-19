public class Time1 {

  private int _hour, _minute, _second;

  /**
   * Constructing the class with time defined by you.
   *
   * @param h
   *  Holds the hour of the time.
   * @param m
   *  Holds the minute of the time.
   * @param s
   *  Holds the seconds of the time.
   */
  public Time1(int h, int m, int s) {
    this.setHour(h);
    this.setMinute(m);
    this.setSecond(s);
  }

  /**
   * Constructing the class with a Time1 object.
   *
   * @param other
   *  An object from the instance of Time1.
   */
  public Time1(Time1 other) {
    this.setHour(other._hour);
    this.setMinute(other._minute);
    this.setSecond(other._second);
  }

  /**
   * Return the hour of the time.
   *
   * @return int
   *  The hour of the current instance.
   */
  public int getHour() {
    return this._hour;
  }

  /**
   * Return the minute of the time.
   *
   * @return int
   *  The minute of the current instance.
   */
  public int getMinute() {
    return this._minute;
  }

  /**
   * Return the seconds of the time.
   *
   * @return int
   *  The second of the current instance.
   */
  public int getSecond() {
    return this._second;
  }

  /**
   * Set the hour of the time.
   *
   * @param num
   *  Integer which holds the hour. Allowed value is between 0 to 23.
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
   *  Integer which holds the minute. Allowed value is between 0 to 59.
   */
  public void setMinute(int num) {
    if (num >= 0 && num <= 59) {
      this._minute = num;
    }
  }

  /**
   * Set the seconds of the time.
   *
   * @param num
   *  Integer which holds the seconds. Allowed value is between 0 to 59.
   */
  public void setSecond(int num) {
    if (num >= 0 && num <= 59) {
      this._second = num;
    }
  }

  /**
   * Get the time object in a string format.
   *
   * @return String
   *  Return the string present the current object.
   */
  public String toString() {
    String output;

    output = this.getHour() < 10 ? "0" + this.getHour() + ":" : this.getHour() + ":";
    output += this.getMinute() < 10 ? "0" + this.getMinute() + ":" : this.getMinute() + ":";
    output += this.getSecond() < 10 ? "0" + this.getSecond() + ":" : this.getSecond();

    return output;
  }

  /**
   * Check if the provided time and the time in the current instance are equals.
   *
   * @param other
   *  An object from the instance of Time1.
   *
   * @return boolean
   *  Return true/false if the properties are equal to the given object.
   */
  public boolean equals(Time1 other) {
    return other._hour == this._hour && other._minute == this._minute && other._second == this._second;
  }

  /**
   * Check if the time in the current instance occur before the given time.
   *
   * @param other
   *  An object from the instance of Time1.
   *
   * @return bool
   *  Return true/false if the current instance occur before the given time.
   */
  public boolean before(Time1 other) {
    return ((this._hour * 3600) + (this._minute * 60) + this._second) < (other._hour * 3600) + ((other._minute * 60) + other._second);
  }

  /**
   * Check if the time in the current instance occur after the given time.
   *
   * @param other
   *  An object from the instance of Time1.
   *
   * @return bool
   *  Return true/false if the time in the current instance occur after the
   *  given time.
   */
  public boolean after(Time1 other) {
    return !this.before(other) && !this.equals(other);
  }

  /**
   * Return the difference in seconds between the given time and the time in the
   * instance.
   *
   * @param other
   *  An object from the instance of Time1.
   *
   * @return int
   *  return the difference in seconds between the given time and the time in
   *  the instance.
   */
  public int difference(Time1 other) {
    return ((this._hour * 3600) + (this._minute * 60) + this._second) - ((other._hour * 3600) + (other._minute * 60) + other._second);
  }
}
