class pattern_7{
public static void main( String [] args){
	
		int l=1;
for(int i=1;i<=8;i+=2){
	for(int k=1;k<=5-l;k++){
		 System.out.print(" ");
	}
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
	l++;
}
 l=7;
for(int i=9 ;i>=1;i-=2){
	for(int k=l-7;k>=1;k--){
		System.out.print(" ");
	}
	for(int j= 1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
	l++;
}
}

}