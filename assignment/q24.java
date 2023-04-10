public class q24 {
    public static void main(String[] args) {
        //float to string
        float l1=1000L;
        String st = Float.toString(l1);
        System.out.println(st);

        //float value to float instance
        float lg= new Float(l1);
        System.out.println(lg);

        //String instance to float instance

        String str=new String("2000");
        float lg2 = new Float(Float.valueOf(str));
        System.out.println(lg2);

        //float into  hexadecimal
       
        String s3=Float.toHexString(l1);
        System.out.println("hexadecimal "+s3);

    }
}
