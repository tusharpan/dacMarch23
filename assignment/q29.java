public class q29 {
    public static void main(String[] args) {
        double b1 = 2;

        Double b = new Double(b1);
 
        System.out.println("Double instance to byte: " + Double.valueOf(b));
        System.out.println("Double instance to Double: " + b.doubleValue());
        System.out.println("Double instance to int: " + b.intValue());
        System.out.println("Double instance to long: " + b.longValue());
        System.out.println("Double instance to float: " + b.floatValue());
        System.out.println("Double instance to double: " + b.doubleValue());
    }
}
