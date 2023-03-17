class pattern_16 {
public static void main(String [] args){
	for(int i=1;i<=5;i++){
		for(int k=1;k<6-i;k++){
				System.out.print(" ");
			}
		for(int j=1;j<=i;j++){
			if( j==5 || i==1 || j==1 || i==j || i==5){
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
				
}
}