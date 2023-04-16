package tushar.labassign.question4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s ;
	System.out.println("enter the value");
	s=sc.nextLine();
	boolean flag=true;
	while(flag) {
		for(int i =s.length()-1;i>=0;i--) {
			Character c = s.charAt(i);
			if(Character.isAlphabetic(c)) {
			
				
				flag=false;
			}
			else {
			    
				System.out.println("enter character values only");
				break;
			}
		}
		if(!flag) {
			System.out.println(Palindrome.isPalindrome(s)); 
		}
	}
	sc.close();
}
}
