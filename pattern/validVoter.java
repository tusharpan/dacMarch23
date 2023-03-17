import java.util.*;
class validVoter{
public static void main(String [] args){
 String name;
 int age;
 String Nationality,voterID;
 System.out.println("enter your name");
 Scanner in= new Scanner (System.in);
 name= in.nextLine();
 System.out.println("enter your age");
 age=in.nextInt();
 System.out.println("enter your nationality");
 Nationality=in.next();
  System.out.println("type yes if you have voter ID");
  voterID=in.next();
 if(age>=18 && Nationality.equals("Indian") && voterID.equals("yes")){
 System.out.println(name+" you are a valid voter");
 }
 else{
	  System.out.println(name+" you are not a valid voter");
 }
}
}
 