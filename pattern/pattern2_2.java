class pattern2_2{
	public static void main(String [] args){
		for(int i = 1;i<=9;i++){
			for(int k =1;k<=10-i;k++){
				System.out.print(" ");
			}
			for(int j= 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}