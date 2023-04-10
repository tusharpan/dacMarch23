// package assignment_3.tushar;
 import java.util.Scanner;

// import assignment_3.tushar.Arey;
class User {
	String Name;
	private String Email;
	private Long phone;
    private int uID=12345;
    int [] bookedFlight = new int [5];
    int seatnumb;
	
	Scanner sc = new Scanner (System.in);
	int i =0;
	public void CreateUser(User [] u1) {
		u1 [i] = new User ();
		System.out.println("Enter name");
		u1[i].Name=sc.nextLine();
		System.out.println("Enter Email ID");
		u1[i].Email=sc.nextLine();
		System.out.println("Enter Phone");
		u1[i].phone=sc.nextLong();
		u1[i].uID+=1;
		System.out.println("USER CREATED YOUR USER ID IS :"+u1[i].uID);
		
	}
}



class Flights{
    boolean [] seatnum = new boolean [50];	
    for(int i =0;i<50;i++){
        if(i%2==0){
            seatnum[i]=true;
        }
    }

	static String [] flights = new String []
			{ 
					"022012 . NEW JAMAICAN AIRWAYS (IND-US)",
					"122334 . EMIRATES (DUB-IND)",
					"231239 . BRITISH AIRWAYS  (ENG-IND)",
					"345678 . AIR INDIA (IND-SINGPR)",
					"456789 . AIR INDIA (IND-SINGPR)"
					
			}; 
	
	
}

class Functionalities {
	Scanner sc = new Scanner(System.in);
	Flights f = new Flights();
	int i =0;
	public int DisplayFlights() {
		System.out.println("FLIGHT NUMBER  . FLIGHT    . (FROM-TO");
		for (int i=0;i<Flights.flights.length;i++) {
			System.out.println(Flights.flights[i]);
		}
		System.out.println("ENTER THE FIRST NUMBER OF FLIGHT NUMBER ");
		return sc.nextInt();
}
	
	public int seatAvailability()
	{       System.out.println("AVAILABLE SEATS ARE");
         for(int i =0;i<f.seatnum.length;i++) {
        	 if(!f.seatnum[i]) {
        		System.out.println(i);
        	 }
         }
         System.out.println("CHOOSE SEAT NUMBER");
        int seat = sc.nextInt();
        f.seatnum[seat]=true;
         return seat;
         
        	 
	}
	
	public void reserve(User [] u1 , Flights [] f) {
	u1[i].bookedFlight[i]=DisplayFlights();
	u1[i].seatnumb=seatAvailability();
	System.out.println("FLIGHT BOOKED \n \n ");
	System.out.println("FLIGHT DETAILS ");
	System.out.println(Flights.flights[u1[i].bookedFlight[i]]+" SEAT NUMBER "+u1[i].seatnumb);
	
	}
}
		
	            


public class Que31 {
	public static void main(String[] args) {
		User [] u1 = new User [5]; 
		Flights [] f = new Flights[] 
		{
			f[0]= new Flights()	,
			f[1]= new Flights()	,
			f[2]= new Flights()	,
			f[3]= new Flights()	,
			f[4]= new Flights()	,
		
		};
		  u1[0].CreateUser(u1);
		}
	}



