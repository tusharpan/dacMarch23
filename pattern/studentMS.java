import java.util.Scanner;
class studentMS{
public static void main(String [] args){
double totalMarks;
double percentage;
System.out.println("enter the total marks out of 500");
Scanner in= new Scanner(System.in);
totalMarks=in.nextInt();
percentage = totalMarks/5;
if(percentage>=95){
System.out.println("distinction and your percentage is "+percentage);
}
if(percentage>=85 && percentage<95){
System.out.println("first division and your percentage is "+percentage);
}
if(percentage>=75 && percentage<85){
System.out.println("second division and your percentage is "+percentage);
}
if(percentage<75 ){
System.out.println("average and your percentage is "+percentage);
}
}
}