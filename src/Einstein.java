import java.util.Scanner;

public class Einstein {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    final int MAGIC_NUMBER = 1089;
    int Number, ReversedNumber, Difference, FirstDigit, SecondDigit, ThirdDigit,
        DifferenceFirstDigit, DifferenceSecondDigit, DifferenceThirdDigit,
        ReversedDifference;

    System.out.println("Welcome! Please enter a number according to next rules:");
    System.out.println("1. Enter a number between 100 to 998");
    System.out.println("2. Enter a non-number palindrome. The first digit and the last must be difference.");
    System.out.println("Please enter the number:");

    Number = scan.nextInt();

    if (Number < 99 || Number > 998) {
      // Not a three digit number. Display an error and return early for a more
      // readable code.
      System.out.println("The number is not a three digit number!");
      return;
    }

    FirstDigit = Number / 100 % 10;
    SecondDigit = Number / 10 % 10;
    ThirdDigit = Number % 10;

    if (FirstDigit == ThirdDigit) {
      System.out.println("The first digit and the last digit are the same. You must a select a non palindrome number.");
      return;
    }

    ReversedNumber = (ThirdDigit * 100) + (SecondDigit * 10) + FirstDigit;

    // Checking which number we need to decrease from each other and then
    // decrease.
    Difference = ReversedNumber > Number ? ReversedNumber - Number : Number - ReversedNumber;

    System.out.println("The reversed number is: " + ReversedNumber);
    System.out.println("The difference between the entered number and his reversed is: " + Difference);

    // Getting the digits of the difference and build the reversed difference.
    DifferenceFirstDigit = Difference / 100 % 10;
    DifferenceSecondDigit = Difference / 10 % 10;
    DifferenceThirdDigit = Difference % 10;
    ReversedDifference = (DifferenceThirdDigit * 100) + (DifferenceSecondDigit * 10) + DifferenceFirstDigit;

    System.out.println("The reversed difference is: " + ReversedDifference);

    if (ReversedDifference + Difference == MAGIC_NUMBER) {
      System.out.println("SUCCEEDED");
    }
    else {
      System.out.println("FAILED");
    }
  }
}