class pattern_14{
public static void main(String [] args){
int l=8;
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
l=1;
for(int i =2;i<=10;i+=2){
for(int k=1;k<=6-l;k++){
System.out.print(" ");
}
for(int j= 1;j<=i;j++){
System.out.print("*");
}
l++;
System.out.println();
}

	
	
}
}