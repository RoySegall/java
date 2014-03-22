public class Time1 {

  private int _hour, _minute, _second;

  public Time1(int h, int m, int s) {
  }

  public Time1(Time1 other) {
  }

  public int getHour() {
    return _hour;
  }

  public int getMinute() {
    return _minute;
  }

  public int getSeconds() {
    return this._second;
  }

  public void setHour(int num) {
  }

  public void setMinute(int num) {
  }

  public void setSecond(int num) {
  }

  public String toString() {
    return "";
  }

  public boolean equals(Time1 other) {
    return true;
  }

  public boolean after(Time1 other) {
    return true;
  }

  public int difference(Time1 other) {
    return 0;
  }
}
