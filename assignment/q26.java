import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {
        float l1,l2;
        Scanner sc= new Scanner(System.in);
        l1=sc.nextFloat();
        l2=sc.nextFloat();

        System.out.println("Minimum value is "+(Float.min(l1, l2)));
        System.out.println("Maximum value is "+(Float.max(l1, l2)));
        System.out.println("dum of the two  value is "+(l1+l2));
    }   
}
