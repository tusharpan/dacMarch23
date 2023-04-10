package assignment_3.tushar;

import java.util.Arrays;
import java.util.Scanner;

class myMenu{
 String dishName ;
double price;

public myMenu() {
	
	this.dishName="abc";
	this.price=0.0;
}
}
class Customise{
	int i =0;
	Scanner sc = new Scanner(System.in);
	public int printOp() {
		System.out.println("0 . EXIT");
		System.out.println("1 . ADD DISH ");
		System.out.println("2 . PRINT THE MENU");
        System.out.println("3 . REMOVE DISH");
		System.out.println("4 . CHANGE THE PRICE");
		System.out.println("ENTER YOUR CHOICE");
		return sc.nextInt();
	}
	    public void printMenu(myMenu[] menu) {
		for(int i=0;i<menu.length;i++) {
			if(menu[i]!=null)
			System.out.println("DISH NAME :\n"+menu[i].dishName + " PRICE : "+ menu[i].price);
		     
		}   
	}
 
	
	
	    public void addDish(myMenu [] menu )
	    {
		           
		if(i<menu.length)
			menu [i]= new myMenu();{
		System.out.println("ENTER THE NAME OF DISH ");
		sc.nextLine();
		menu[i].dishName=sc.nextLine();
		System.out.println("ENTER THE PRICE OF DISH");
		menu[i].price=sc.nextDouble();
		System.out.println("DISH ADDED SUCCESSFULLY");
		System.out.println();
		System.out.println();
		System.out.println();
		i++;
			}
	
		   
		}
	
	public void remDish(myMenu[]menu) {
		System.out.println("enter the dish number that you "
				+ "want to remove");
		           int index = sc.nextInt();
		           menu[index]=null;
		           System.out.println("THE NEW MENU IS");
		           printMenu(menu);
		 
	}
	public void changePrice(myMenu[]menu) {
		System.out.println("Enter the Dish number");
		int index = sc.nextInt();
		System.out.println("Enter the new price ");
		menu[index].price=sc.nextInt();
		System.out.println("THE NEW MENU IS");
        printMenu(menu);
	}
}


public class Que2{
	public static void main(String[] args) {
		
		Customise c =new Customise();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTR THE MENU LENGTH");
		int size = sc.nextInt();
		myMenu [] menu = new myMenu[size];
		int choice ;
		while((choice = c.printOp())!=0) {
			switch(choice) {
			case 2:  c.printMenu(menu);
				break;
				
			case 1 : 
				     c.addDish(menu);
				break;
			case 3 : 
			           c.remDish(menu);
			           break;
			case 4 :  c.changePrice(menu);
				break;
               
			}
		}
		
		  System.out.println("!!!! THANK YOU !!!!");
		
	}
        
}
