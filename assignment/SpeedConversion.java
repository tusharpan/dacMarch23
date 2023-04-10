import java.util.Scanner;
public class SpeedConversion {
    public static void main(String[] args) {
        float  dist;
        float arr [] = new float[3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the distance in meters");
        dist=s.nextFloat();
        System.out.println("Enter the hour ");
        arr[0]=s.nextFloat();
        System.out.println("Enter the minutes ");
        arr[1]=s.nextFloat();
        System.out.println("Enter the seconds ");
        arr[2]=s.nextFloat();
        float mps = dist/(arr[2]+(arr[1]*60)+(arr[0]*60*60));
        float kmph = (dist/(1000))/(arr[0]+(arr[1]/60)+(arr[2]/(60*60)));
        float miph = (dist/(1609))/(arr[0]+(arr[1]/60)+(arr[2]/(60*60)));
        System.out.println("the speed in meters per second is "+mps);
        System.out.println("the speed in kilometers per hour is "+kmph);
        System.out.println("the speed in miles per hour is "+miph);

    }
}