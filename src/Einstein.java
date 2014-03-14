import java.util.Scanner;

public class Einstein {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int Number, ReversedNumber, Difference, FirstDigit, SecondDigit, ThirdDigit;

    System.out.println("Please enter a three digit number without trailing zeros when the first digit and last are different from each other: ");

    Number = scan.nextInt();

    if (Number < 99 || Number > 999) {
      // Not a three digit number. Display an error and return early for a more
      // readable code.
      System.out.println("The number is not a three digit number!");
      return;
    }

    FirstDigit = Number / 100 % 10;
    SecondDigit = Number / 10 % 10;
    ThirdDigit = Number % 10;

    ReversedNumber = (ThirdDigit * 100) + (SecondDigit * 10) + FirstDigit;

    // Checking which number we need to decrease from each other and then
    // decrease.
    Difference = ReversedNumber > Number ? ReversedNumber - Number : Number - ReversedNumber;

    System.out.println("The reversed number is: " + ReversedNumber);
    System.out.println("The difference between the entered number and reversed is: " + Difference);
  }
}