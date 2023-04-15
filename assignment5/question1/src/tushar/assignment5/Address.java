package tushar.assignment5;
public class Address implements Cloneable {
String street,city,state;

public Address(String street, String city, String state) {
	
	this.street = street;
	this.city = city;
	this.state = state;
}
@Override
protected Address clone() throws CloneNotSupportedException {
Address other = (Address)super.clone();
	return other;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
}


}
