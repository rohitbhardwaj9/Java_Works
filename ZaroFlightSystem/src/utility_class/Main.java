package utility_class;

import java.util.ArrayList;
import java.util.Scanner;

import dao_class.FlightManagementSystem;
import model_class.Flight;

public class Main {

	public static void main(String[] args) {

		FlightManagementSystem fms = new FlightManagementSystem();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the source: ");
		String inputSource = sc.next();

		System.out.println("Enter the destination: ");
		String inputDestination = sc.next();

		sc.close();

        ArrayList<Flight> matchingFlights = fms.viewFlightBySourceDestination(inputSource, inputDestination);

        if (matchingFlights.isEmpty()) {
            System.out.println("No flights available for the given source and destination");
        } else {
            System.out.println("Flightid Noofseats Flightfare");
            for (Flight flight : matchingFlights) {
                System.out.println(flight.getFlightId() + " " + flight.getNoOfSeats() + " " + flight.getFlightFare());
            }
        }

	}

}
