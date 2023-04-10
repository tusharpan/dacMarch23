package assignment_3.tushar;
import java.util.Scanner;
public class Flights1 
{
    static boolean [] seatnum = new boolean [5];
  String flights [] = {
		  "022012 . NEW JAMAICAN AIRWAYS (IND-US) 25 AVAIL",
		  "122334 . EMIRATES (DUB-IND) 25 AVAIL",
		  "231239 . BRITISH AIRWAYS  (ENG-IND) 25 AVAIL",
		  "345678 . AIR INDIA (IND-SINGPR) 25 AVAIL",
		  "456789 . AIR INDIA (IND-SINGPR) 25 AVAIL" 
  };

  static int j=0;
private void setseat() {
	for(int i=0;i<50;i++) {
		
		if(i%2==0) 
		{ 
		   seatnum[i]=true;
		   
		}
		
		  	
	}

}

public  static void displaySeat() {
	for(int i =0;i<seatnum.length;i++) {
		if(!seatnum[i]) {
			System.out.print(i);
			j++;
		}
		if(j==5) {
			System.out.println();
			j=0;
		}
		
	}
}
}
