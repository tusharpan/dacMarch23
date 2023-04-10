package assignment_3.tushar;
import java.util.Scanner;
public class Functionalities1 {
	int index=0;
	 Flights1 f = new Flights1 ();//flight class instance
	 Scanner sc = new Scanner (System.in);
	
     
     //print menu method
	public int printMenu() 
	{
		System.out.println("0 . EXIT");
		System.out.println("1 . CREATE USER");
		System.out.println("2 . RESERVE FLIGHT");
		System.out.println("3 . SEE ALL RESERVATIONS");
		System.out.println("4 . CANCEL FLIGHT");
	    System.out.println("ENTER CHOICE");
		return sc.nextInt();
	}
	
	//method to display flight detail
	public int DisplayFlights() 
	{
		System.out.println("FLIGHT NUMBER  . FLIGHT    . (FROM-TO)");
		for (int i=0;i<f.flights.length;i++) 
		{
			System.out.println(f.flights[i]);
		}
		System.out.println("ENTER THE FIRST NUMBER OF FLIGHT NUMBER ");
		return sc.nextInt();
	}
	
	public int selectSeat() {
		f.displaySeat();
		System.out.println("ENTER THE SEST NUMBER");
		return sc.nextInt();
	}
 
	
	//method to book the seat
	public void reserve(User1 u1[],int i) 
	{
		u1[i].bookedFlights[index]=DisplayFlights();
		u1[i].seats[index]=selectSeat();
		
		
		System.out.println("FLIGHT BOOKED");
		System.out.println("FLIGHT DETAILS :"+f.flights[u1[i].bookedFlights[index]]+" "+u1[i].seats[i]);
		index++;
	}
	
	public void seereserve(User1 u1[],int i) {
		for(int j =0;j<u1[i].bookedFlights.length;j++) {
			if((u1[i].bookedFlights[j])!=-1)
		System.out.println("YOUR RESERVED FLIGHTS ARE"+f.flights[u1[i].bookedFlights[j]]+" "+u1[i].seats[i]);
			
	}
	
	
	}
	
	public void cancelReserve(User1 u1[],int i) 
	{
		seereserve(u1,i);
		System.out.println("ENTER THE NUMBER WHICH YOU WANT TO CANCEL");
		int cancel=sc.nextInt();
		u1[i].bookedFlights[cancel]=-1;
			
		
	}
	
	
	
}
