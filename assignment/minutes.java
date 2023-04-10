import java.util.Scanner;
public class minutes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the minutes");
        long minute = sc.nextLong();
        long days = minute/((1440));
        long year = minute/(365*24*60);
        System.out.println((days-(year*365)) + "  "+year );
    }
}
