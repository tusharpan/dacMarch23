class pattern9{
public static void main( String [] args){
	int n=69;
for(int i=65;i<=n;i++){
for(int j=n-i;j>0;j--){
System.out.print(" ");
}
for(int k=65;k<=i;k++){
System.out.print((char) k+" ");
}
System.out.println();
}
}

}