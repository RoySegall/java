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
    letters[1][1] = 2;
    letters[1][0] = 'a';
    letters[2][1] = 2;
    letters[2][0] = 'a';
    letters[3][1] = 2;
    letters[3][0] = 'a';

    int i = 0;
    int j = 0;

    checkOccurrences(letters, s, i, j);

    return false;
  }

  public static void checkOccurrences(Object[][] letters, String string, int i, int j) {
    if (i >= string.length()) {
      return;
    }

    if (j > 0 && string.charAt(i) == letters[j - 1][1]) {
      System.out.println("a");
//      int foo = (int)letters[j-1][0];
      letters[j-1][0] = (int)  + 1;
      letters[j-1][1] = string.charAt(i);
    }

    letters[j][0] = i;
    letters[j][1] = string.charAt(i);

    j++;
    checkOccurrences(letters, string, i + 1, j);

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
