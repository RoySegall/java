public class isTranceTest {

  /**
   * Check if the t string got transformed from s string. A string got
   * transformed if each character from the s string is appear, in the same
   * order, at least once.
   *
   * @param s
   *  The original string.
   * @param t
   *  The string we need to verify that got transformed.
   *
   * @return Boolean
   *  True/false if the the string t got transformed.
   */
  public static boolean isTrance(String s, String t) {

    if (s.matches(t)) {
      // The string matches. No need to continue.
      return true;
    }

    Object[][] letters = new Object[s.length()][2];

    letters[0][1] = 2;
    letters[0][0] = 'a';

    for (int i = 0; i < t.length(); i++) {
    }

    return false;
  }

  public static void checkOccurrences(Object[][] letters, String string) {

  }

  public static void main(String[] args) {
    String[][] strings = {
//      {"abbcd", "abbcd"}, // Passed.
      {"abbcd", "aaaabbcd"}, // Passed.
      {"abbcd", "a"}, // Not passed.
      {"abbcd", "abcd"}, // Not passed.
    };

    for (int i = 0; i < strings.length; i++) {
      if (isTrance(strings[i][0],strings[i][1])) {
        System.out.println("The string " + strings[i][1] + " got transformed from " + strings[i][0]);
      }
      else {
        System.out.println("The string " + strings[i][1] + " was not got transformed from " + strings[i][0]);
      }
      break;
    }
  }
}
