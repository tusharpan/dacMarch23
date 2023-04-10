// package assignment_3.tushar;
// import assignment_3.tushar.Arey;

import java.util.Arrays;
import java.util.Scanner;

class myMenu{
String dishName="abc" ;
double price=0;
}
class Customise{
	
	 Scanner sc = new Scanner(System.in);
	public int printOp() {
		System.out.println("0 . EXIT");
		System.out.println("5 .CREATE NEW MENU");
		System.out.println("1 . PRINT THE MENU");
		System.out.println("2 . ADD DISH ");
		System.out.println("3 . REMOVE DISH");
		System.out.println("4 . CHANGE THE PRICE");
		System.out.println("ENTER YOUR CHOICE");
		return sc.nextInt();
	}
	

    public void createMenu(myMenu [] menu){
        for(int i =0;i<menu.length;i++){
            
            System.out.println("Enter the Dishname");
             menu[i].dishName=sc.nextLine();
             System.out.println("Enter the Price");
             menu[i].price=sc.nextDouble();
           

        }
    }
	public void printMenu(myMenu[] menu) {
		for(int i=0;i<menu.length;i++) {
			if(menu[i]!=null)
			System.out.println(menu[i]);
		}   
	}
 
	
	public void addDish(myMenu [] menu ,int size) {
		System.out.println("ENTER THE NAME OF DISH ");
		menu[size].dishName=sc.nextLine();
		System.out.println("ENTER THE PRICE OF DISH");
		menu[size].price=sc.nextDouble();
		System.out.println("DISH ADDED SUCCESSFULLY");
		printMenu(menu);
		   
		}
	
	public void remDish(myMenu[]menu) {
		System.out.println("enter the dish number that you "
				+ "want to remove");
		           int index = sc.nextInt();
		           menu[index]=null;
		 
	}
	public void changePrice(myMenu[]menu) {
		System.out.println("Enter the Dish number");
		int index = sc.nextInt();
		System.out.println("Enter the new price ");
		menu[index].price=sc.nextInt();
	}
}


public class Que21{
	public static void main(String[] args) {
		
		Customise c =new Customise();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		myMenu [] menu = new myMenu[ size];
		int choice ;
		while((choice = c.printOp())!=0) {
			switch(choice) {
			case 1 :  c.printMenu(menu);
				break;
				
			case 2 : size=size+1;
				     c.addDish(menu,size);
				break;
			case 3 : 
			           c.remDish(menu);
			           break;
			case 4 :  c.changePrice(menu);
				break;
                case 5: c.createMenu(menu);
                break;
			}
		}
		
		
		
	}
        
}
