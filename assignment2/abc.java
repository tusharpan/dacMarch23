
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
class abc{
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter date :");
        String day=sc.nextLine();
    
        SimpleDateFormat sdf =new SimpleDateFormat("dd/mm/yyyy");
        Date date=sdf.parse(day);
        String scr =sdf.format(date);
        System.out.println("date : "+scr);
       
        SimpleDateFormat sdf1 =new SimpleDateFormat("mm/dd/yyyy");
        Date date1=sdf1.parse(day);
        String scr1 =sdf1.format(date1);
        System.out.println("date : "+scr1);

        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy/mm/dd");
        Date date2=sdf2.parse(day);
        String scr2 =sdf2.format(date);
        System.out.println("date : "+scr2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("kk:mm:ss");
        SimpleDateFormat sdf4 = new SimpleDateFormat("hh:mm:ss:a");
        SimpleDateFormat sdf5 = new SimpleDateFormat("kk:mm");
        String scr3=new String ();
        scr3 =sc.nextLine();
        Date date3 = sdf3.parse(scr3);
        String optim = sdf3.format(date3);
        String optim2 = sdf4.format(date3);
        String optim3 = sdf5.format(date3);
        System.out.println(optim);
        System.out.println(optim2);
        System.out.println(optim3);
        System.out.println(sdf4.toPattern()); // o/p =hh:mm:ss:a
        sdf5.applyPattern(scr3);
        System.out.println( scr3);

        SimpleDateFormat sdf6 = new SimpleDateFormat("dd/mm/yyyykk:mm:ss");
        SimpleDateFormat sdf7 = new SimpleDateFormat(" mm/dd/yyyyhh:mm:ss");
        SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy/mm/ddkk:mm");
        String scr4=new String ();
        scr4 =sc.nextLine();
        Date date4 = sdf6.parse(scr3);
        String optim11 = sdf6.format(date4);
        String optim12 = sdf7.format(date4);
        String optim13 = sdf8.format(date4);
        System.out.println(optim11);
        System.out.println(optim12);
        System.out.println(optim13);        

    }
}