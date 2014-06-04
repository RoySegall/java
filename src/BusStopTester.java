
public class BusStopTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    BusArrival firstBusArrival = new BusArrival(20, 55, 10, 30, 0);
    Time1 time1 = new Time1(9, 30, 0);

    BusArrival secondBusArrival = new BusArrival(18, 30, time1);

    System.out.println(firstBusArrival);
    System.out.println(secondBusArrival);


    System.out.println("The line number of the first BusArrival object is: " + firstBusArrival.getLineNum());
    System.out.println("The number of passengers of the first BusArrival object is: " + firstBusArrival.getNoOfPass());
    System.out.println("The arrival time of the first BusArrival object is: " + firstBusArrival.getArrivalTime());

    // Create Bus stop object.
    BusStop busStop = new BusStop();

    // Add arrival time
    busStop.add(firstBusArrival.getLineNum(), firstBusArrival.getNoOfPass(), firstBusArrival.getArrivalTime());
    busStop.add(secondBusArrival.getLineNum(), secondBusArrival.getNoOfPass(), secondBusArrival.getArrivalTime());

    busStop.add(20, 60, new Time1(9, 40, 00));
    busStop.add(25, 55, new Time1(10,00,00));

    // print the array.
    System.out.println("Number of arrival times: " + busStop.getNoOfBuses());
    System.out.println("\nThe arrival times:\n" + busStop);
    System.out.println("Total passengers: " + busStop.totalPassengers());

    System.out.println("Arrival with max passengers: " + busStop.maxPassengers());

    System.out.println("\nAfter removing line\n");
    busStop.removeAllLine(35);
    System.out.println(busStop);

    System.out.println("\nAvearge time: " + busStop.getAverageTime());

    System.out.println("\nThe popular line: " + busStop.getPopularLine());
	}
}

