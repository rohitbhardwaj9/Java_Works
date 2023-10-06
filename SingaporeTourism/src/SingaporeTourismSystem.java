import java.util.Scanner;

public class SingaporeTourismSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double beachPrice = 270.00;
		double pilgrimagePrice = 350.00;
		double heritagePrice = 430.00;
		double hillsPrice = 780.00;
		double fallsPrice = 1200.00;
		double adventurePrice = 4500.00;

		System.out.println("Enter the Passenger Name:");
		String passengerName = sc.nextLine();
		
		System.out.println("Enter the place:");
		String placeName = sc.nextLine().toLowerCase();
		
		if(((placeName == "beach") || (placeName == "pilgrimage") || (placeName == "heritage") || (placeName == "hills") || (placeName == "falls") || (placeName == "adventures"))) {
			System.out.println(placeName+" is an invalid place");
			return;
		}
		
		System.out.println("Enter the number of Days:");
		int noofdays = sc.nextInt();
		
		if(noofdays < 0) {
			System.out.println(noofdays+" is an invalid days");
			return;
		}
		
		System.out.println("Enter the no of Tickets: ");
		int tickets = sc.nextInt();
		

		if(tickets < 0) {
			System.out.println(tickets+ " is an invalid tickets.");
			return;
		}
		
		double ticketPrice = 0.0;
		switch(placeName) {
		case "beach": 
			ticketPrice = beachPrice;
			break;
		case "pilgrimage":
			ticketPrice = pilgrimagePrice;
			break;
		case "heritage": 
			ticketPrice = heritagePrice;
			break;
		case "hills":
			ticketPrice = hillsPrice;
			break;
		case "falls": 
			ticketPrice = fallsPrice;
			break;
		case "adventures":
			ticketPrice = adventurePrice;
			break;
		}
		
		double totalCost = ticketPrice * tickets * noofdays;
		
		if(totalCost > 1000) {
			totalCost = totalCost * .85;
		}
		
		System.out.println("Bill Amount is "+ totalCost);
		
	}

}
