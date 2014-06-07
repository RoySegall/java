import java.util.Arrays;

public class matchTest {

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
      int j = 0;
      int localMatch[] = new int[3];
      for (int i = 0; i < a.length; i++) {
        j++;
        localMatch[j % 3 == 0 ? 2 : (j % 3) - 1] = a[i];

        if (j % 3 == 0) {
          // When we found a wrong pattern we return false. Until then
          // everything is OK.
          if (!match(localMatch, pattern)) {
            return false;
          }
        }
      }
    }

    if (a.length == 3) {
      boolean[] digits = new boolean[3];

      for (int i = 0; i <= 2; i++) {
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
      }

      // Check the array is in the right pattern.
      return digits[0] && digits[1] && digits[2];
    }

    // If nothing went wrong until here then the pattern is OK.
    return true;
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

  public static void main(String[] args) {
    if (match(new int[]{2, 3, 57}, new int[]{1, 0 ,2})) {
      System.out.println("Success");
    }
    else {
      System.out.println("Failed");
    }


    if (match(new int[]{2, 3, 57, 4, 24, 35}, new int[] {1, 0 ,2})) {
      System.out.println("Success");
    }
    else {
      System.out.println("Failed");
    }

    if (match(new int[]{2, 3}, new int[] {1, 0 ,2})) {
      System.out.println("Success");
    }
    else {
      System.out.println("Failed");
    }

    if (match(new int[]{2, 3, 573, 4, 324, 35}, new int[] {1, 0 ,2})) {
      System.out.println("Success");
    }
    else {
      System.out.println("Failed");
    }
  }
}
