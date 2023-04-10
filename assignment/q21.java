public class q21 {
    public static void main(String[] args) {
        long b1 = 2;

        Long b = new Long(b1);
 
        System.out.println("Long instance to byte: " + Long.valueOf(b));
       System.out.println("Long instance to Long: " + b.shortValue());
        System.out.println("Long instance to int: " + b.intValue());
        System.out.println("Long instance to long: " + b.longValue());
        System.out.println("Long instance to float: " + b.floatValue());
        System.out.println("Long instance to double: " + b.doubleValue());
    }
}
