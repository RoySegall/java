import java.util.Scanner;

public class Line {

  public static void main(String [] args) {
    // Declare variables we will use.
    int x1, x2, y1, y2;
    double d;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter 4 integers.");

    // Get the coordinates for x1 and x2.
    System.out.println("Please enter x1: ");
    x1 = scan.nextInt();

    System.out.println("Please enter x2: ");
    x2 = scan.nextInt();

    // Get the coordinates for y1 and y2.
    System.out.println("Please enter y1: ");
    y1 = scan.nextInt();

    System.out.println("Please enter xy: ");
    y2 = scan.nextInt();

    // Calculate the distance between the points and display this the user.
    d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
    System.out.println("The distance is " + d);
  }
}