public class StringList
{
  private CharNode _head;

  public StringList( ) {
    this._head = null;
  }

  public StringList(CharNode node) {
    if (node == null) {
      this._head = null;
    }
    else {
      this._head = new CharNode(node.getData(), node.getValue(), null);
      for (CharNode ptr = node.getNext(),last = this._head; ptr != null; ptr = ptr.getNext()) {
        last.setNext(new CharNode(ptr.getData(),ptr.getValue(),
        ptr.getNext()));
        last = last.getNext();
      }
    }
  }

  /**
   * Todo!
   */

  /**
   * Constructing a linked list from the given string.
   *
   * @param s
   *  The given string.
   */
  public StringList (String s) {
  }

  /**
   * Constructing a linked list from linked list object.
   *
   * @param other
   *  The linked list.
   */
  public StringList (StringList other) {
  }

  /**
   * Returning a char at a given position.
   *
   * @param i
   *  The i position.
   *
   * @return
   *  A char in the i position.
   */
  public char charAt(int i) {
    return 'a';
  }

  /**
   *
   * @param str
   * @return
   */
  public StringList concat (StringList str) {
    return this;
  }

  /**
   * Return the index of the ch in the string represented by the current
   * instance.
   *
   * @param ch
   *  The char we are looking for.
   *
   * @return
   *  The position we looking for.
   */
  public int indexOf (char ch) {
    return -1;
  }

  /**
   * Return the position of the charecter in the string the current instance
   * represent when the search start from the index fromIndex.
   *
   * @param ch
   *  The char we are looking for.
   * @param fromIndex
   *  The index we need to start from.
   *
   * @return
   *  The position we looking for.
   */
  public int indexOf(char ch, int fromIndex) {
    return -1;
  }

  /**
   * Return true if the current string represented by the current instance
   * equals to string represented by the given object.
   *
   * @param str
   *  A StringList object.
   *
   * @return
   *  Return true if string are equals.
   */
  public boolean equalsTo(StringList str) {
    return false;
  }

  /**
   * Comparing between a given string and the current string.
   *
   * @param str
   *  The string.
   * @return
   *  0 if the strings are equal.
   *  Negative number if the current string smaller in alphabetic order.
   *  Positive number if the current string bigger in alphabetic order.
   */
  public int compareTo(StringList str) {
    return 0;
  }

  /**
   * Return a substring.
   * @param i
   *  The start position.
   * @param j
   *  The ending position.
   * @return
   *  String extracted from the current string.
   */
  public StringList substring(int i, int j) {
    return this;
  }

  /**
   * @return
   *  The length of the string.
   */
  public int length() {
    return 0;
  }

  /**
   * @return
   *  The current object as a string.
   */
  public String toString() {
    return "a";
  }

}