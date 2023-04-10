public class q16 {
   public static void main(String[] args) {
    int a = 5;
    System.out.println(Integer.toString(a));


    //integer to integer instance 
    Integer newint = new Integer(a);
    System.out.println(a);

    //String instance to integer instance
    String str = new String("1234");
    Integer abc = new Integer(Integer.valueOf(str));
    System.out.println(abc);

    //Integer to octal hexadecimal binary

    String s1 = Integer.toBinaryString(a);
    System.out.println("decimal to binary "+s1);
    String s2= Integer.toOctalString(a);
    System.out.println("decimal to octal"+s2);
    String s3= Integer.toHexString(a);
    System.out.println("decimal to hexadecimal "+s3);


   }
}
