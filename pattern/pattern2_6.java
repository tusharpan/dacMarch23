class pattern2_6{
public static void main( String [] args){

for(int i=9 ;i>=1;i-=2){
	for(int k=1;k<10-i;k++){
		System.out.print(" ");
	}
	for(int j= 1;j<=i;j++){
		System.out.print("* ");
	}
	System.out.println();
	
}
}

}