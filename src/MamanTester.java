public class MamanTester {

  public static void main(String[] args) {

    // Create 10 times.
    Time1[] time = new Time1[] {
      new Time1(5, 20, 00),
      new Time1(5, 40, 00),
      new Time1(6, 10, 00),
      new Time1(6, 30, 00),
      new Time1(6, 45, 00),
      new Time1(6, 59, 00),
      new Time1(7, 12, 00),
      new Time1(7, 24, 00),
      new Time1(7, 44, 00),
      new Time1(7, 56, 00),
      new Time1(8, 10, 00),
    };

    // Create array with 10 buses.
    BusStop bus = new BusStop(10);

    // Add buses.
    bus.add(61, 10, time[0]);
    bus.add(60, 5, time[1]);
    bus.add(39, 20, time[2]);
    bus.add(61, 7, time[3]);
    bus.add(61, 8, time[4]);
    bus.add(61, 9, time[5]);
    bus.add(70, 15, time[6]);
    bus.add(75, 20, time[7]);
    bus.add(39, 1, time[8]);
    bus.add(60, 0, time[9]);
    BusStop busForLater = bus;

    // Try to add the 11th bus.
    if (!bus.add(60, 20, new Time1(10, 59, 00))) {
      System.out.println("You can't add the 11th bus. No place!");
    }

    // Verify the getters: 10 buses and their strings.
    System.out.println("The output of the BusStop: ");
    System.out.println(bus);

    // Create new bus with no limits.
    System.out.println("\nCreate new BusStop instance.");
    bus = new BusStop();

    // Add 5 buses from the with the same line, remove him and verify he was
    // gone.
    System.out.println("Check the line removal. Create 6 buses: 2 60, 3 70, 1 9.");
    bus.add(60, 0, time[0]);
    bus.add(60, 0, time[1]);
    bus.add(70, 0, time[2]);
    bus.add(70, 0, time[3]);
    bus.add(70, 0, time[4]);
    bus.add(9, 0, time[5]);
    bus.removeAllLine(70);

    BusArrival[] buses = bus.getBuses();

    Boolean found = false;
    for (int i = 0; i < bus.getNoOfBuses(); i++) {
      if (buses[i].getLineNum() == 70) {
        found = true;
      }
    }

    if (found) {
      System.out.println("Error! The line 70 was not removed.");
    }

    // Check the strings output.
    System.out.println("The output of the bus instance: ");
    System.out.print(bus);

    // Create a popular line and check he is the popular one.
    if (busForLater.getPopularLine() == 61) {
      System.out.println("The popular line is 61. Congrats.");
    }
    else {
      System.out.println("The popular line is not 61. Check your self.");
    }

    // Create a new bus object.
    time = new Time1[] {
      new Time1(10, 30, 0),
      new Time1(9, 40, 0),
      new Time1(9, 30, 0),
      new Time1(10, 0, 0),
    };

    // Check the average time by the example from the manan.
    bus = new BusStop(4);
    bus.add(20, 20, time[0]);
    bus.add(20, 20, time[1]);
    bus.add(20, 20, time[2]);
    bus.add(20, 20, time[3]);

    System.out.println("Av" + bus.getAverageTime());

    // Check the total passengers.

    // Check the max passengers.
  }
}
