package mypackage;


import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ArrayUtils {
 private int size,sum;
 private Scanner sc = new Scanner(System.in);
 private int [] arr;


 public void setArr() throws RuntimeException {
	 arr=new  int [size];
	for(int i =0;i<size;i++) {
		arr[i]=sc.nextInt();

}
 
}
 public int getSum() {
	for(int e : arr) {
		sum+=e;
	}
	return sum;
}
}
