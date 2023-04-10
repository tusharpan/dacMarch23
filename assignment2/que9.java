import java.util.Scanner;

class Date{
   private int day ,month ,year;
   int choice;
   int tnd,tnm,tny,tpd,tpm,tpy;
   Scanner sc = new Scanner (System.in);

    public void printmenu(){
        System.out.println("ENTER CHOICE");
        System.out.println("0 . exit");
        System.out.println("1 . set date");
        System.out.println("2 . next date");
        System.out.println("3 . previous date");
        System.out.println("4 . check leap year");
        System.out.println("5 . check valid date");        

        

    }
   public void setDate()
   {  
     System.out.println("enter date");
     int day=sc.nextInt();
     System.out.println("enter month");
     int month =sc.nextInt();
     System.out.println("enter year");
     int year =sc.nextInt();
     this.day=day;
     this.tpd=day;
     this.tnd=day;
     this.month=month;
     this.tnm=month;
     this.tpm=month;
     this.year=year;
     this.tpy=year;
     this.tny=year;

   }


   public boolean isValid(){
     
    if ( (this.day>0) && (this.day<=31) && (this.month<=12)&&(this.month>0) && (this.year>1582) ){
        if(((this.year%100==0)&&(this.year%400==0))||(this.year%4==0)){
            if((this.month==2 )&&(this.day<=29))
           
            return true;
        }
        else if((this.month==2 )&&(this.day<29)){
        
        return true;
        }
        
        return true;
    }
    
    return false;

   }
   public boolean has31(){
    for(int i=1;i<=12;i+=2){
        if(i==7){
            return true;
        }
        if(this.month==i){
            return true;
        }
       
    }
     return false;
    

   }
   
   public boolean isLeapYear(){
    
         if(this.year%4==0){
         if(this.year%100==0){
         if(this.year%400==0){
            
            return true;
         }
         else{
            
            return false;
         }
        }
        else{
            
            return true;
        }
         }
         else{
            
            return false;
         }
        }
        
    

   public void getNextDay(){
    boolean d=this.isValid();
    if(d){
    boolean a=this.has31();
    boolean c= this.isLeapYear();
    if((c)&&(this.month==2)&&(this.day==29)){
        
        this.tnd=1;
        this.month+=1;
        System.out.println("NEXT DATE WILL BE "+this.tnd+"/"+this.month+"/"+this.year);

    }
    else if((!c)&&(this.month==2)&&(this.day==28)){
        
        this.tnd=1;
        this.month+=1;
        System.out.println("NEXT DATE WILL BE "+this.tnd+"/"+this.month+"/"+this.year);

    }
       else if((this.day==31)&&(this.month==12)){
             this.tnd=1;
             this.tny+=1;
             this.tnm=1;
             System.out.println("NEXT DATE WILL BE "+this.tnd+"/"+this.tnm+"/"+this.tny);
        }
       else  if((a)&&(this.day==31)&&(this.month<12)){
            this.tnd=1;
            this.tnm+=1;
            System.out.println("NEXT DATE WILL BE "+this.tnd+"/"+this.tnm+"/"+this.year);
        }
        else if((!a)&&(this.day==30)){
            this.tnd=1;
            this.tnm+=1;
            System.out.println("NEXT DATE WILL BE "+this.tnd+"/"+this.tnm+"/"+this.year);
        }
        else if((this.day<31)){
            this.tnd+=1;
            System.out.println("NEXT DATE WILL BE "+this.tnd+"/"+this.month+"/"+this.year);
        }
    }
        

   }
   public void prevDay(){
    boolean d=this.isValid();
    if(d){
    boolean a=this.has31();
    boolean c= this.isLeapYear();
    if((c)&&(this.month==3)&&(this.day==1)){
        this.tpd=29;
        this.tpm-=1;
        System.out.println("PREVIOUS DATE WAS "+this.tpd+"/"+this.tpm+"/"+this.year);

    }
   
   else if((this.month==3)&&(this.day==1)){
         this.tpd=28;
         this.tpm=2;
         System.out.println("PREVIOUS DATE WAS "+this.tpd+"/"+this.tpm+"/"+this.year);
    }
       else if((this.day==1)&&(this.month==1)){
             this.tpd=31;
             this.tpy-=1;
             this.tpm=12;
             System.out.println("PREVIOUS DATE WAS "+this.tpd+"/"+this.tpm+"/"+this.tpy);
        }
       else  if((!a)&&(this.day==1)&&(this.month<12)){
            this.tpd=31;
            this.tpm-=1;
            System.out.println("PREVIOUS DATE WAS "+this.tpd+"/"+this.tpm+"/"+this.year);
        }
        else if((a)&&(this.day==1)){
            this.tpd=30;
            this.tpm-=1;
            System.out.println("PREVIOUS DATE WAS "+this.tpd+"/"+this.tpm+"/"+this.year);
        }
        else if((this.day>1 )){
            this.tpd-=1;
            System.out.println("PREVIOUS DATE WAS "+this.tpd+"/"+this.month+"/"+this.year);
        }
    }
    
    
   }

}
           


public class que9 {
    public static void main(String[] args) {
        int choice;
        Date date = new Date();
        date.printmenu();
        Scanner sc  =new Scanner(System.in);
        while((choice=sc.nextInt())!=0){
            date.printmenu();
            switch (choice){
                case 1 :date.setDate( );
                break;
                case 2 :date.getNextDay();
                break;
                case 3 :date.prevDay();
                break;
                case 4 : boolean c=date.isLeapYear();
                if(c){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("NON LEAP YEAR");
                }
                break;
                case 5 : boolean d= date.isValid();
                if(d){
                 System.out.println("VALID DATE");
                }
                else{
                 System.out.println("INVALID DATE");
                 break;
                }
            }
            System.out.println("enter the choice");
        }
        
      

        
    }
    }
    

