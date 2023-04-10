import java.util.Scanner;

class ElectricityBill{
String customerName ;
double unitsConsumed;
double billAmount;

ElectricityBill(){
    this.customerName="NO NAME";
    this.unitsConsumed=0.0;
    this.billAmount=0.0;
}
ElectricityBill(String customerName , double unitsConsumed )
{
    this.customerName=customerName;
    this.unitsConsumed=unitsConsumed;
    
}
 public double calculateBillAmount(double unitsConsumed){
     double price =1.0;
     if(unitsConsumed<=100){
        price=unitsConsumed*5;
        return price;
     }
     
     if(unitsConsumed<=200){
        double temp = unitsConsumed-100.00;
        price=100*5;
        temp*=7;
        return (price+temp);
     }
     if (unitsConsumed>200){
        double temp = unitsConsumed-100.00;
        price=100*5;
        temp = temp-100.00;
        price+=100*7;
        price+=temp*10;
        return price;


     }
     return 0.0;
        }
    public void getDetails(){
        System.out.println("Name  : "+this.customerName);
        System.out.println("Units Consumed "+this.unitsConsumed);
        System.out.println("BillAmout "+this.billAmount);
    }
}
public class que4 {
    public static void main(String[] args) {
        
    
    ElectricityBill bill_1 = new ElectricityBill("Umair Waseem",300);
    System.out.println();
    System.out.println("-----ELECTRICITY BILL------");
    System.out.println("Customer Name   :"+bill_1.customerName);
    System.out.println("Units Consumed  :"+bill_1.unitsConsumed);
    System.out.println("Final amount to be paid "+bill_1.calculateBillAmount(bill_1.unitsConsumed));
    }
}
