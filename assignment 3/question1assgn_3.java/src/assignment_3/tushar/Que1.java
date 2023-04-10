package assignment_3.tushar;

import java.util.Arrays;
import java.util.Scanner;
class Arey{
	int avg;
	
	int sum=0;
	
	 Scanner sc = new Scanner(System.in);
	 
	 public static int printMenu() {
		 Scanner scc = new Scanner(System.in);
		
		 System.out.println("0 . EXIT");
		 System.out.println("1 . CREATE ARRAY");
		 System.out.println("2 . PRINT ARRAY");
		 System.out.println("3 . CALCULATE SUM");
		 System.out.println("4 . DISPLAY AVERAGE");
		 System.out.println("5 . GREATEST ELEMENT");
		 System.out.println("6 . SMALLEST ELEMENT");
		 System.out.println("7 . SORT");
		 System.out.println("ENTER CHOICE");
		 return scc.nextInt();
	 }
	
	public void acceptEle(int [] arr) 
	{
		
		System.out.println("Enter array elements");
		for(int i =0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public void printEle(int [] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public int doSum(int [] arr) {
		
		for(int i =0 ;i<arr.length;i++) {
			 sum+= arr[i];
		}
		return sum;
		
	}
	
	public int doAvg(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			avg=(this.sum)/arr.length;
		}
		return avg;
	}
	
	public int greatestEle(int [] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public int smallestEle (int [] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	public void sort(int [] arr) {
		int arrq[] = new int [arr.length];
		arrq =Arrays.copyOf(arr,arr.length);
		System.out.println(Arrays.toString(arrq));
	}
}

public class Que1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array ");
		size= sc.nextInt();	
		int [] arr = new int [size];
		
		Arey ar = new Arey();
		int choice;
		
		while((choice = Arey.printMenu())!= 0) {
			switch(choice) {
			case 1 :  ar.acceptEle(arr);
			break;
			case 2:   ar.printEle(arr);
			break;
			case 3:   int ele =ar.doSum(arr);
			System.out.println("the sum of the elements "
					+Arrays.toString(arr)+ " is "+ele);
			break;
			
			case 4 :    ele = ar.doAvg(arr);
			System.out.println("the avg  of the elements "
					+Arrays.toString(arr)+ " is "+ele);
			break;
			case 5 :  ele = ar.greatestEle(arr);
			System.out.println("the greatest of the elements "
					+Arrays.toString(arr)+ " is "+ele);
			break;
			case 6 : ele = ar.smallestEle(arr);
			System.out.println("the smallest of the elements "
					+Arrays.toString(arr)+ " is "+ele);
			break;
			case 7 : ar.sort(arr);
			break;
			}
			
		}
		
	}
	

}
