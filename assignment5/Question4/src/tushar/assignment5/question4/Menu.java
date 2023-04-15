package tushar.assignment5.question4;

import java.util.Comparator;
import java.util.Scanner;

public class Menu implements Comparable<Menu> {
String dishName;
double price;
int cal;
public Menu(String dishName, double price, int cal) {
	super();
	this.dishName = dishName;
	this.price = price;
	this.cal = cal;
}


@Override
	public int compareTo(Menu o) {
		return this.cal-o.cal;

	}
private static Scanner sc = new Scanner(System.in);

public static int menuList() {
	System.out.println("0.Exit");
	System.out.println("1.Name.");
	System.out.println("2.Price.");
	System.out.println("3.Calorie Count.");
	return sc.nextInt();
}
public static void print(Menu [] menu) {
	System.out.println("dish                               price                 calorie");
	for(Menu me : menu) {
		System.out.println(me.toString());
	}
}


@Override
public String toString() {
	return String.format("%-35s%-25f%-15d",this.dishName,this.price,this.cal);
}

}
