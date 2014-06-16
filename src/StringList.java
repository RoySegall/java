public class StringList {
  private CharNode _head;

  /**
   * Empty constructor.
   */
  public StringList( ) {
    this._head = null;
  }

  /**
   * Constructing the object when a single CharNode object is provided.
   * @param node
   *  A CharNode object represent a single character.
   */
  public StringList(CharNode node) {
    if (node == null) {
      this._head = null;
    }
    else {
      this._head = new CharNode(node.getData(), node.getValue(), null);
      for (CharNode ptr = node.getNext(),last = this._head; ptr != null; ptr = ptr.getNext()) {
        last.setNext(new CharNode(ptr.getData(), ptr.getValue(), ptr.getNext()));
        last = last.getNext();
      }
    }
  }

  /**
   * Constructing a linked list from the given string.
   *
   * @param s
   *  The given string.
   */
  public StringList(String s) {
    this._head = new CharNode(s.charAt(0), 0, null);

    CharNode handler = this._head;
    int inRow = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i - 1) == s.charAt(i)) {
        inRow++;
      }
      else {
        inRow = 0;
      }
      CharNode temp = new CharNode(s.charAt(i), inRow == 0 ? 0 : inRow + 1, null);
      while (handler.getNext() != null) {
        handler = handler.getNext();
      }

      handler.setNext(temp);
    }
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
    int j = 0;
    char ret = ' ';
    CharNode handler = this._head;

    if (i == 0) {
      return handler.getData();
    }

    while (handler.getNext() != null) {
      handler = handler.getNext();

      if (j == i) {
        return handler.getData();
      }

      j++;
    }

    return ret;
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
  public int indexOf(char ch) {
    CharNode handler = this._head;
    int j = 0;

    if (this._head.getData() == ch) {
      return 0;
    }

    while (handler.getNext() != null) {

      if (handler.getData() == ch) {
        return j;
      }

      j++;
      handler = handler.getNext();
    }

    return -1;
  }


  /**
   * @return
   *  The current object as a string.
   */
  public String toString() {
    String string;
    CharNode handler = this._head;
    string = "" + handler.getData();

    while (handler.getNext() != null) {
      handler = handler.getNext();
      string += "" + handler.getData();
    }

    return string;
  }

  /**
   * @return
   *  The length of the string.
   */
  public int length() {
    CharNode handler;
    int i = 1;
    handler = this._head;

    while (handler.getNext() != null) {
      i++;
      handler = handler.getNext();
    }

    return i;
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
    return this._equalsTo(this._head, str._head);
  }

  /**
   * Since we need to use recursion in order to compare between the string this
   * function will help us.
   */
  private boolean _equalsTo(CharNode currentInstance, CharNode comparedInstance) {
    if (currentInstance.getData() == comparedInstance.getData()) {

      if ((currentInstance.getNext() == null && comparedInstance.getNext() != null) || currentInstance.getNext() != null && comparedInstance.getNext() == null) {
        // We have a next data in the current instance and not in the compared
        // instance or the opposite. return false.
        return false;
      }

      // The current data are equals checking with the next nodes.
      return this._equalsTo(currentInstance.getNext(), comparedInstance.getNext());
    }

    // The data are not equals - return false.
    return false;
  }

  /**
   * Todo!
   */

  /**
   * Constructing a linked list from linked list object.
   *
   * @param other
   *  The linked list.
   */
  public StringList(StringList other) {
  }

  /**
   *
   * @param str
   * @return
   */
  public StringList concat(StringList str) {
    StringList string;

    string = new StringList(this._head);
    CharNode temp = this._head;
    while (temp.getNext() != null) {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
//    this._head.setNext(str._head);

    return this;
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
}