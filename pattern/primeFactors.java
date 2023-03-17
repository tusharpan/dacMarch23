import java.util.*;
public class primeFactors{
public static void main(String [] args){
	 Scanner in=new Scanner(System.in);
	 int numIn;
	 System.out.println("enter the number");
	 numIn= in.nextInt();
	 for(int i =1;i<=numIn/2;i++){
	 if(numIn%i==0){
		 checkPrime(i);
	 }
	 }
}

	public static void checkPrime(int i){
		int flag=0,rem;
		for(int j=1;j<i;j++){
			if(i%j!=0 || i==2){
				flag=1;
				
			}
			else{
			flag=0;
			continue;
			}
		}
		if(flag==1){
			System.out.println(i);
		}
	}
}
	
