package tushar.assignment5.question3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size;
	System.out.println("enter the size");
	size=sc.nextInt();
	Products pins = new Products();
	Products [] p = new Products[size];
	Products.createProduct(p,size);
	pins.print(p);
	Arrays.sort(p, pins);
	pins.print(p);
}
}
