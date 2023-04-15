package tushar.assignment5.question3;

import java.util.Comparator;
import java.util.Scanner;

public class Products implements Comparator<Products> {
String name;
double price;
String category;
static Scanner sc = new Scanner (System.in);

public static void createProduct(Products [] p , int size ) {
for(int index=0; index<size;index++) {
	p[index] = new Products();
	acceptRecord(p,index);
}

}
public static void acceptRecord(Products [] p , int index ) {
	System.out.println("enter name");
	p[index].name=sc.nextLine();
	System.out.println("enter price");
	p[index].price=sc.nextDouble();
	System.out.println("enter category");
	sc.nextLine();
	p[index].category=sc.nextLine();
}

public static void print(Products [] p) {
	for (Products products : p) {
		System.out.println(products.toString());
	}
	System.out.println();
}
@Override
	public int compare(Products o1, Products o2) {
		return (int)(o1.price-o2.price);
	
	}

@Override
public String toString() {
	return  String.format("%-30s%-30s%-30f",this.name,this.category,this.price);
}

   
}
