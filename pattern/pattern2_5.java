class pattern2_5{
public static void main( String [] args)
{
int n=9;
for(int i=1;i<=n;i++){
	for(int j=n-i;j>0;j--){
		System.out.print("  ");
	}
	for(int k=n-i+1;k<=n;k++){
		System.out.print(k+" ");
	}
	for(int l=n-i+1;l<n;l++){
		System.out.print(l+" ");
	}
	System.out.println();
}
}
}
