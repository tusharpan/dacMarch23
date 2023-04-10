public class que_8 {
    public static void main(String[] args) {
        // byte to string
        byte b1 =1;
        String s= Byte.toString(b1);
        System.out.println(s);

        // byte to byte instance 
        Byte b2=100;
        Byte b3= new Byte(b2);
        System.out.println(b3);

        //string instance into byte instance
        String s2 = new String("123");
        byte b4 = new Byte(Byte.valueOf(s2));
        System.out.println(b4);

    }
}
