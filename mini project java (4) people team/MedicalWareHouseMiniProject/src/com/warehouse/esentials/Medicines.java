package com.warehouse.esentials;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Medicines {
String medName , manufacturer ,medType ;
String expDate;//import statement might give error
int dosage;
double price;
String [] substitue = new String [3];

public Medicines() {}

public Medicines(String medName, String manufacturer, String medType, String expDate, int dosage, double price,String substitute1,String substitue2) {

	this.medName = medName;
	this.manufacturer = manufacturer;
	this.medType = medType;
	this.expDate = expDate;
	this.dosage = dosage;
	this.price = price;
	this.substitue[0]=substitute1;
	this.substitue[1]=substitue2;
}
public Medicines(String medName, String manufacturer, String medType, String expDate, int dosage, double price,String substitute1,String substitue2,String substitute3) {

	this.medName = medName;
	this.manufacturer = manufacturer;
	this.medType = medType;
	this.expDate = expDate;
	this.dosage = dosage;
	this.price = price;
	this.substitue[0]=substitute1;
	this.substitue[1]=substitue2;
	this.substitue[2]=substitute3;
}






@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Medicines other = (Medicines) obj;
	return Objects.equals(medName, other.medName);
}

@Override
public String toString() {
	return "Medicines [medName=" + medName + ", manufacturer=" + manufacturer + ", medType=" + medType + ", expDate="
			+ expDate + ", dosage=" + dosage + ", price=" + price + ", substitue=" + Arrays.toString(substitue) + "]";
}




}
