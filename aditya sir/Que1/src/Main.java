import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
class Function{
	
    
	public   void swap(int [] a, int [] b) 
	{ 
		a[0]= a[0]*b[0];
		b[0]=a[0]/b[0];
		a[0]=a[0]/b[0];
		
  }
}

public class Main {
	
	public static void main(String[] args) {
		Function f = new Function();
	Scanner sc=new Scanner(System.in)	;

 int a [] = new int [1];
 int b []= new int [1];
 System.out.println("ENTER VALUE");
 a[0]= sc.nextInt();
 b[0]=sc.nextInt();

 System.out.println(a[0]);
 System.out.println(b[0]);
 f.swap(a,b);
 System.out.println(a[0]);
 System.out.println(b[0]);
 
	}
}
