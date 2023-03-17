class pattern10{
public static void main( String [] args){
	int n=65;
for(int i=69;i>=n;i--){
for(int j=i-n;j>0;j--){
System.out.print(" ");
}
for(int k=i;k<=69;k++){
System.out.print((char) k+" ");
}
System.out.println();
}
}

}