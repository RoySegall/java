public class Time2 {

  private long _secFromMid;

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
  public Time2(int h, int m, int s) {
  }

  /**
   * Constructing the class with a Time2 object.
   *
   * @param other
   *  An object from the instance of Time2.
   */
  public Time2(Time2 other) {
  }

  /**
   * Return the hour of the time.
   */
  public int getHour() {
    return 0;
  }

  /**
   * Return the minute of the time.
   */
  public int getMinute() {
    return 0;
  }

  /**
   * Return the seconds of the time.
   */
  public int getSeconds() {
    return 0;
  }

  /**
   * Set the hour of the time.
   *
   * @param num
   *  Integer which holds the hour. Allowed value is between 0 to 23.
   */
  public void setHour(int num) {
  }

  /**
   * Set the minute of the time.
   *
   * @param num
   *  Integer which holds the minute. Allowed value is between 0 to 59.
   */
  public void setMinute(int num) {
  }

  /**
   * Set the seconds of the time.
   *
   * @param num
   *  Integer which holds the seconds. Allowed value is between 0 to 59.
   */
  public void setSecond(int num) {
  }

  /**
   * Get the time object in a string format.
   */
  public String toString() {
    // todo: make it.
    return "";
  }

  /**
   * Check if the provided time and the time in the current instance are equals.
   *
   * @param other
   *  An object from the instance of Time2.
   */
  public boolean equals(Time2 other) {
    return other.getHour() == this.getHour() && other.getMinute() == this.getMinute() && other.getSeconds() == this.getSeconds();
  }

  /**
   * Check if the time in the current instance occur before the given time.
   *
   * @param other
   *  An object from the instance of Time2.
   */
  public boolean before(Time2 other) {
    int other_timestamp = (other.getHour() * 3600) + (other.getMinute() * 60) + (other.getSeconds() * 60);
    int Time2_timestamp = (this.getHour() * 3600) + (this.getMinute() * 60) + (this.getSeconds() * 60);

    return Time2_timestamp < other_timestamp;
  }

  /**
   * Check if the time in the current instance occur after the given time.
   *
   * @param other
   *  An object from the instance of Time2.
   */
  public boolean after(Time2 other) {
    int other_timestamp = (other.getHour() * 3600) + (other.getMinute() * 60) + (other.getSeconds() * 60);
    int Time2_timestamp = (this.getHour() * 3600) + (this.getMinute() * 60) + (this.getSeconds() * 60);

    return Time2_timestamp > other_timestamp;
  }

  /**
   * Return the difference in seconds between the given time and the time in the
   * instance.
   *
   * @param other
   *  An object from the instance of Time2.
   */
  public int difference(Time2 other) {
    int other_timestamp = (other.getHour() * 3600) + (other.getMinute() * 60) + (other.getSeconds() * 60);
    int Time2_timestamp = (this.getHour() * 3600) + (this.getMinute() * 60) + (this.getSeconds() * 60);

    if (other_timestamp > Time2_timestamp) {
      return other_timestamp - Time2_timestamp;
    }
    else {
      return Time2_timestamp - other_timestamp;
    }
  }
}
