class pattern2_4{
public static void main( String [] args){
for(int  i=1;i<=9;i++){
	for(int k=1;k<10-i;k++){
		System.out.print(" ");
	}
for(int j= 1;j<=i;j++){
System.out.print(j);
}
if(i>=2){
for(int w=i-1;w>=1;w--){
	System.out.print(w);
}
}
System.out.println();
}
}
}