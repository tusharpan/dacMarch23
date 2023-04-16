import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s ;
	int flag =0;
	System.out.println("enter");
	s= sc.nextLine();
	for(int i =s.length()-1;i>=0;i--) {
		Character c = s.charAt(i);
		if(Character.isAlphabetic(c)) {
		
			flag =1;
		}
		else {
			flag=0;
			System.out.println("enter character values only");
			break;
		}
	}
	if(flag==1) {
	
	for(int i =s.length()-1;i>=0;i--) {
		
		System.out.print(s.charAt(i));
	}
	}
}
}
