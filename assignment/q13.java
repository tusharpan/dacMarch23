public class q13 {
    public static void main(String[] args) {
        short sh =12;

        //short to string
        String str= Short.toString(sh);
        System.out.println(str);

        //short to short instance
        Short sh1 = new Short(sh);
        System.out.println(sh);
        
        //string instance to short
        Short sh2 = new Short(Short.valueOf(str));
        System.out.println(sh2);

        //Integer to octal hexadecimal binary
        
    }
}
