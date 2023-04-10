public class q25 {
    public static void main(String[] args) {
        float b1 = 2.0f;

        Float b = new Float(b1);
 
        System.out.println("Float instance to byte: " + Float.valueOf(b));
        System.out.println("Float instance to Float: " + b.doubleValue());
        System.out.println("Float instance to int: " + b.intValue());
        System.out.println("Float instance to long: " + b.longValue());
        System.out.println("Float instance to Float: " + b.floatValue());
    }
}
