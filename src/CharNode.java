public class CharNode {

  private char _data;
  private int _value;
  private CharNode _next;

  public CharNode(char c, int val, CharNode n) {
    this._data = c;
    this._value = val;
    this. _next = n;
  }

  public CharNode getNext() {
    return this._next;
  }

  public void setNext(CharNode node) {
    this._next = node;
  }

  public int getValue() {
    return this._value;
  }

  public void setValue(int v) {
    this._value = v;
  }

  public char getData() {
    return this._data;
  }

  public void setData(char c) {
    this._data = c;
  }

}
