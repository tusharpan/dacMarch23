import java.util.Scanner;

class TelephoneBillCalculation{
    String customerName ;
    String telePhoneNumber;
    int numsOfCalls;
    int duration;

    TelephoneBillCalculation(){
        this.customerName ="";
        this.telePhoneNumber="";
        this.numsOfCalls=0;
        this.duration=0;
    }
    TelephoneBillCalculation(String customerName,String telePhoneNumber ,int numsOfCalls,int duration)
    {
          this.customerName= customerName;
          this.telePhoneNumber=telePhoneNumber;
          this.numsOfCalls=numsOfCalls;
          this.duration=duration;
    }
    public int getDuration(){
        return this.duration;
    }

    public int getNumOfCalls(){
        return this.numsOfCalls;
    }


    public double teleBill(int numsOfCalls , int duration){
        if(numsOfCalls<=100){
            double price = numsOfCalls*(0.50);
            return price;
        }
        if(numsOfCalls>100){
            double temp  = numsOfCalls-100;
            double price = temp*0.25;
            return price;
            }
          return 10;
    }
}


public class que5 {
    public static void main(String[] args) {
        TelephoneBillCalculation tb1 = new TelephoneBillCalculation("rohan shewale","99999999",30,10);
        System.out.println("<------PHONE BILL------>");
        System.out.println("User Name "+tb1.customerName);
        System.out.println("Mobile Number :"+tb1.telePhoneNumber);
        System.out.println("Number of calls made "+tb1.numsOfCalls);
         System.out.println("Total Bill :"+tb1.teleBill(tb1.getNumOfCalls(), tb1.getDuration())+" $");


        


    }
    
}
