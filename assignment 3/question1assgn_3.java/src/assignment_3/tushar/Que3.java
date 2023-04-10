package assignment_3.tushar;
import java.util.Scanner;

import assignment_3.tushar.*;


public class Que3 {
	public static void main(String[] args) {
		int choice,i=0;
		Functionalities1 func = new Functionalities1();
		User1[] u1 = new User1[5];
		User1 userobj=new User1();
		Flights1 [] f = new Flights1[] 
		{
			 new Flights1()	,
			 new Flights1()	,
			 new Flights1()	,
			 new Flights1()	,
			 new Flights1()	,
		
		};
		
		while((choice=func.printMenu())!=0) {
			switch(choice) {
			case 1:userobj.createUser(u1,i);
			
			break;
			case 2: func.reserve(u1,i);
			break;
			case 3: func.seereserve(u1, i);
			break;
			case 4: func.cancelReserve(u1, i);
			break;
			
			
			}
		}
		 
		 
		
		
		 
		}
	}


