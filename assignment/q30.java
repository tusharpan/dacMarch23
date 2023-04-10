import java.util.Scanner;
public class q30 {
    public static void main(String[] args) {
        double l1,l2;
        Scanner sc= new Scanner(System.in);
        l1=sc.nextDouble();
        l2=sc.nextDouble();

        System.out.println("Minimum value is "+(Double.min(l1, l2)));
        System.out.println("Maximum value is "+(Double.max(l1, l2)));
        System.out.println("dum of the two  value is "+(l1+l2));
    }
}
