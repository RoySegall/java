/**
 * Please send me the feedback in english. I have mac and can't see the hebrew
 * text.
 */

public class StringList {
  private CharNode _head;

  /**
   * Empty constructor.
   */
  public StringList() {
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
    if (s == "") {
      this._head = null;
    }
    else {
      this._head = new CharNode(s.charAt(0), 0, null);
    }


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
   * Constructing a linked list from linked list object.
   *
   * @param other
   *  The linked list.
   */
  public StringList(StringList other) {
    String s = other.toString();
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
    char ret = '\0';

    if (this._head == null) {
      return ret;
    }

    int j = 0;

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
    if (this._head == null) {
      return 0;
    }

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
   * Return the position of the character in the string the current instance
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
    String string = this.toString();

    if (fromIndex > string.length()) {
      // Not in the range. Return -1;
      return -1;
    }

    for (int i = 0; i < string.length(); i++) {

      if (i <= fromIndex) {
        // We still not in the index we need to start from. Continue for now.
        continue;
      }

      if (ch == string.charAt(i)) {
        // Return the index that the char belong to.
        return i;
      }
    }

    return -1;
  }

  /**
   * @return
   *  The current object as a string.
   */
  public String toString() {
    if (this._head == null) {
      return "";
    }

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
    if (this._head == null) {
      return 0;
    }

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
   * Comparing between a given string and the current string.
   *
   * @param str
   *  The string.
   *
   * @return
   *  0 if the strings are equal.
   *  Negative number if the current string smaller in alphabetic order.
   *  Positive number if the current string bigger in alphabetic order.
   */
  public int compareTo(StringList str) {
    String currentString, comparedSting;

    // Get the compared object to strings. Would be much more easier.
    currentString = this.toString();
    comparedSting = str.toString();

    if (currentString.equals(comparedSting)) {
      // The string are equals. Return 0.
      return 0;
    }

    if (currentString.length() == comparedSting.length()) {
      // The strings are equals by length iterate over them and check
      // alphabetical order.
      for (int i = 0; i < currentString.length(); i++) {

        if (currentString.charAt(i) == comparedSting.charAt(i)) {
          continue;
        }

        return currentString.charAt(i) > comparedSting.charAt(i) ? 1 : -1;
      }
    }

    // The current string is bigger then the given string. Return positive
    // number.
    return currentString.length() > comparedSting.length() ? 1 : -1;
  }

  /**
   * Concatenating to StringList objects into a single StringList object.
   *
   * @param str
   *  The we need to contact with the string from the current object.
   *
   * @return
   *  A StringList object with to StringList objects.
   */
  public StringList concat(StringList str) {
    String currentString = this.toString();
    String externalString = str.toString();

    String string = currentString + "" + externalString;
    StringList returnedStringList = new StringList(string);

    CharNode temp = this._head;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }

    return returnedStringList;
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
    if (this._head == null) {
      return null;
    }
    
    int k = 0;
    CharNode handler = this._head;
    String string = "";

    while (handler.getNext() != null) {

      if (k >= i && k <= j) {
        string += handler.getData();
      }

      handler = handler.getNext();
      k++;
    }

    return new StringList(string);
  }
}