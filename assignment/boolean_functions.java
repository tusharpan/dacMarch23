import java.lang.Boolean;

class boolean_functions{
    public static void main(String[] args) {
        boolean b1 = true;
        //converts boolean to string
        String s=Boolean.toString(b1);
        System.out.println(s);

        //convert boolean value into boolean instance
        Boolean b2=new Boolean(false);
        System.out.println(b2);
        

        //String values to boolean value
        String s2="true";
        boolean b3=Boolean.valueOf(s2);
        System.out.println(b3);

        //String value to boolean instance
         String s3="false";
         Boolean b4= new Boolean(Boolean.valueOf(s3));
         System.out.println(b4);






    }
}
