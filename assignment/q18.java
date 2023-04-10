import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("max integer is "+Integer.max(n, n2));
        System.out.println("min integer is "+Integer.min(n, n2));
        System.out.println("sum of the two integer is "+(n+n2));

    }
}
