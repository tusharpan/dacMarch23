package assignment_3.tushar;
import java.util.Scanner;
public class User1 {
 int i =0,j=0;
 String userName;
 String email;
 int phone;
 int [] bookedFlights = {-1,-1,-1,-1,-1};
 int [] seats = new int[5];
 Scanner sc = new Scanner(System.in);
 

    public void createUser(User1 u1 [],int index) 
    {
     u1[index]= new User1();
     
	System.err.println("ENTER USER NAME");
	this.userName=sc.nextLine();
	System.err.println("ENTER EMAIL ID");
	this.email=sc.nextLine();
	System.err.println("ENTER PHONE NUMBER");
	this.phone=sc.nextInt();
    }
    


}
