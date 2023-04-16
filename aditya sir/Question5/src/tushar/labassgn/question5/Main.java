package tushar.labassgn.question5;

import java.util.Scanner;



public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s ;
	

	boolean flag=true;
	while(flag) {
		System.out.println("enter the value");
		 s=sc.nextLine();
		 System.out.println(s);
		for(int i =s.length()-1;i>=0;i--) {
			Character c = s.charAt(i);
			if(Character.isAlphabetic(c) || Character.isSpaceChar(c)) {
			   flag=false;
				continue;
			}
			else {
			   flag=true;
				System.out.println("enter character values only");
				break;
			}
		}
		if(!flag) {
		WordCount.wordCount(s); 
		}
	}
	sc.close();
}
}
