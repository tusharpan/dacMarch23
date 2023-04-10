public class q20 {
    public static void main(String[] args) {

        //long to string
        long l1=1000L;
        String st = Long.toString(l1);
        System.out.println(st);

        //long value to long instance
        Long lg= new Long(l1);
        System.out.println(lg);

        //String instance to long instance

        String str=new String("2000");
        Long lg2 = new Long(Long.valueOf(str));
        System.out.println(lg2);

        //long into binary octal hexadecimal
        String s1= Long.toBinaryString(l1);
        System.out.println("binary "+s1);
        String s2= Long.toOctalString(l1);
        System.out.println("octal "+s2);
        String s3=Long.toHexString(l1);
        System.out.println("hexadecimal "+s3);

    }
}
