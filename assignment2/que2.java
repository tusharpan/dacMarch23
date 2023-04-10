import java.util.Scanner;



class BmiCalculator{
    private double height;
    private double weight;

    BmiCalculator(){
        this.height=0.0;
        this.weight=0.0;
    }

    Scanner sc = new Scanner (System.in);


    public double getHeight(){
       return this.height;
    }
    public double getWeight()
    {
        return this.weight;
    }


     public void setHeight (){        
        
        this.height = sc.nextDouble();
    }

    public void setWeight(){
        System.out.println("ENTER WEIGHT");
        this.weight =   sc.nextDouble();
        
    }
    
    public double calculateBmi(double height, double weight){
        
        return weight/(height*height);
         
    }
}
public class que2 {
    public static void main(String[] args) {
        BmiCalculator inp = new BmiCalculator();
        System.out.println("ENTER HEIGHT");
        inp.setHeight();
        inp.setWeight();
        double heightVal = inp.getHeight();
        double weightVal = inp.getWeight();
        double bmi =inp.calculateBmi(heightVal,weightVal);
        System.out.println("your BMI is "+bmi);
        
    }
}
