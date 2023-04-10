 import java.util.Scanner;
 class challenge {
    public static void main(String [] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        if(a>=10 && a<=1000){
            int temp ;
            int sum=0;
            while(a>0){
                temp=a%10;
                sum=sum+temp;
                a=a/10;
            } 
            System.out.println(sum);       
        }
        else
        System.out.println("enter between 10 and 1000 only");
    }
}
