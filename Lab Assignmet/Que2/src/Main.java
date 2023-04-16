import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
import mypackage.ArrayUtils;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayUtils obj = new ArrayUtils ();
		try {
			System.out.println("Enter the size");
			obj.setSize(sc.nextInt());
			obj.setArr();
		} catch (RuntimeException e) {
			System.out.println("input a number only");
			e.printStackTrace();
		}
		System.out.println(obj.getSum());
		
		
}
	
}         
