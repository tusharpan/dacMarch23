public class q14 {
    public static void main(String[] args) {
        short b1 = 2;

        Short b = new Short(b1);
 
        System.out.println("Short instance to byte: " + Short.valueOf(b));
        System.out.println("Short instance to short: " + b.shortValue());
        System.out.println("Short instance to int: " + b.intValue());
        System.out.println("Short instance to long: " + b.longValue());
        System.out.println("Short instance to float: " + b.floatValue());
        System.out.println("Short instance to double: " + b.doubleValue());
    }
}
