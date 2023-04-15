package tushar.assignment5;

public class Main {
	public static void main(String[] args) {
		
	
	Address adr =  new Address("shaitan gali","hawa mahal","Maharashtra");
    Person p = new Person("Rakess" , adr);
    try {
    	 System.out.println("p ka string1"+p.toString());
		Person p2 =p.clone();
		  System.out.println(p2.toString());
		  p2.name="gahnsyam";
		  p2.adr.city="dubai";
		  p2.adr.street="burjalarab gali";
		  p2.adr.city="india";
		  System.out.println("p ka string2"+p.toString());
		  System.out.println(p2.toString());
	} catch (CloneNotSupportedException e) {
		
		e.printStackTrace();
	}
  
	}
    
}
