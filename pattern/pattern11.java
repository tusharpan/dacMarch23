class pattern11{
public static void main( String [] args){
	int l=1;
for(int i=1;i<=10;i+=2){
	for(int k=1;k<=7-l;k++){
		 System.out.print("  ");
	}
	for(int j=1;j<=i;j++){
		System.out.print("* ");
	}
	System.out.println();
	l++;
}
} 

}