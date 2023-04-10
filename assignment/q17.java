public class q17 {
    public static void main(String[] args) {
        int b1 = 130;

        Integer b = new Integer(b1);
 
        System.out.println("Integer instance to byte: " + b.byteValue());
       System.out.println("Integer instance to Integer: " + b.shortValue());
        System.out.println("Integer instance to int: " + b.intValue());
        System.out.println("Integer instance to long: " + b.longValue());
        System.out.println("Integer instance to float: " + b.floatValue());
        System.out.println("Integer instance to double: " + b.doubleValue());
    }
}
