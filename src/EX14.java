/**
 * Roy Segall 200838068
 *
 * I can't see hebrew notes because i have mac. Can you please write the notes
 * in english? Thank you.
 */
public class EX14 {

  /**
   * A. The method count the amount of sub-strings that start with the start
   * character and end with the end character.
   *
   * B. The time complexity is o(n^2) since when the original method iterate
   *    over the string n times. When she hit the start character she iterate
   *    the reset of loop. When she hit again the start character again she
   *    iterate the rest of the loop again.
   *
   * D. My time complexity is o(n) since my method iterate the string characters
   *    only once.
   *
   * @param str
   *  The string we need to handle.
   * @param start
   *  The starting character of the sub string.
   * @param end
   *  The end character for the sub string.
   * @return
   *  The amount of sub-strings that start with start and end with end.
   */
  public static int what(String str, char start, char end) {
    int startInstances = 0;
    int endInstances = 0;
    for (int i = 0; i < str.length(); i++) {
      startInstances = str.charAt(i) == start ? startInstances + 1 : startInstances;
      endInstances = str.charAt(i) == end ? endInstances + startInstances : endInstances;
    }
    return endInstances;
  }

  /**
   * Sorting the array by the next hierarchy:
   *  1. n % 4 == 0
   *  2. n % 4 == 1
   *  3. n % 4 == 2
   *  3. n % 4 == 3
   *
   * @param arr
   *  Array of numbers we need to sort.
   */
  public static void sortByFour(int[] arr) {
    // Define variables.
    int[] sorted = new int[arr.length];
    int location = 0;

    // Cloning the arr array in order to prevent aliasing.
    for (int i = 0; i < arr.length; i++) {
      sorted[i] = arr[i];
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 0) {
        arr[location++] = sorted[i];
      }
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 1) {
        arr[location++] = sorted[i];
      }
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 2) {
        arr[location++] = sorted[i];
      }
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] % 4 == 3) {
        arr[location++] = sorted[i];
      }
    }
  }

  /**
   * Check pattern of numbers for a given array. We need to verify each 3
   * numbers with a pattern. if the given array isn't in a group of 3 numbers
   * then the pattern is wrong and you'll get false.
   *
   * @param a
   *  The given array.
   * @param pattern
   *  The given pattern. Each key belong to the i place in the a variable. i.e.
   *  pattern[0] will relate to a[0]. When dealing with arrays bigger then 3
   *  then pattern[0] will relate to a[0] and a[4], pattern[2] will relate to
   *  a[2] and a[5] etc. etc.
   *
   *  0 - will check if the number is full number with 1 digit or 2 digits.
   *  1 - will check if the number is full number with 1 digit.
   *  2 - will check if the number is full number with 2 digits.
   *
   * @return boolean
   *  Verity the pattern in the given array.
   */
  public static boolean match(int[] a, int[] pattern) {

    if (a.length < 3) {
      // The a is less then 3. Return false.
      return false;
    }

    if (a.length > 3) {
      // The a array is more then 3. Verify the sub arrays in batches.
      int localMatch[] = new int[3];
      iterateMatches(0, 0, a, pattern, localMatch);
    }

    if (a.length == 3) {
      boolean[] digits = new boolean[3];

      verifyDigits(digits, pattern, a, 0);

      // Check the array is in the right pattern.
      return digits[0] && digits[1] && digits[2];
    }

    // If nothing went wrong until here then the pattern is OK.
    return true;
  }

  /**
   * Since we can't iterate with loops we will iterate with a helper function.
   * @param i
   *  Iterate indicator.
   * @param j
   *  Help is build the match array.
   * @param a
   *  The original array.
   * @param pattern
   *  The pattern for authentication
   * @param localMatch
   *  Building a local variable that will pass to the original match function.
   * @return
   *  True or false for the pattern the a array.
   */
  public static boolean iterateMatches(int i, int j, int[] a, int[] pattern, int[] localMatch) {
    localMatch[j % 3 == 0 ? 2 : (j % 3) - 1] = a[i];
    if (j % 3 == 0) {
      // When we found a wrong pattern we return false. Until then
      // everything is OK.
      return !match(localMatch, pattern);
    }
    i++;
    j++;
    return iterateMatches(i, j, a, pattern, localMatch);
  }

  /**
   * Since we can't iterate we will use a helper function for iterate over the
   * digits and pattern arrays and build a boolean array that holds the boolean
   * information about the pattern authentication status.
   *
   * @param digits
   *  The digits array.
   * @param pattern
   *  The pattern for authentication.
   * @param a
   *  The original array.
   * @param i
   *  Iterate indicator.
   */
  public static void verifyDigits(boolean[] digits, int[] pattern, int[] a, int i) {
    if (i > 2) {
      return;
    }

    switch (pattern[i]) {
      case 1:
        digits[i] = oneDigit(a[i]);
        break;

      case 2:
        digits[i] = twoDigit(a[i]);
        break;

      default:
        digits[i] = oneDigit(a[i]) || twoDigit(a[i]);
        break;
    }
    i++;
    verifyDigits(digits, pattern, a, i);
  }

  /**
   * Verify the given number is a single number.
   *
   * @param number
   *  The number we need to check.
   *
   * @return Boolean
   */
  private static boolean oneDigit(int number) {
    return number > -10 && number < 10;
  }

  /**
   * Check if the given number is a two digits number.
   *
   * @param number
   *  The number we need to check.
   *
   * @return Boolean.
   */
  private static boolean twoDigit(int number) {
    return (number < -9 && number > -100) || (number > 9 && number < 100);
  }

}
