package tushar.assignment5;
public class Person implements Cloneable{
String name;
Address adr ;
public Person(String name, Address adr) {
	
	this.name = name;
	this.adr = adr;
}
@Override
protected Person clone() throws CloneNotSupportedException {
Person other = (Person)super.clone();
other.adr=this.adr.clone();
	return other;
}
@Override
public String toString() {
	return "Person [name=" + name + ", adr=" + adr.toString() + "]";
}

	

}
