package com.warehouse.customerEssentials;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.warehouse.esentials.Medicines;
import com.warehouse.esentials.medUtils;

public class Customer {





	static Scanner sc = new Scanner(System.in);
	private String name;
	private String address;
	private String phoneNumber;
	private String doctorName;
	private double totalAmount;
	List<Medicines> soldmeds = new ArrayList<>();

	
	public Customer() {}

	public Customer(String name, String address, String phoneNumber, String doctorName) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.doctorName = doctorName;
	
	}

	public void createBill(List<Medicines> medList,List<Customer>customers) {
           int choice =0;
           System.out.println("press any key to continue || press 0 to stop");
         while((choice = sc.nextInt())!=0){
        	 System.out.println("press any key to continue || press 0 to stop");
		customers.add(Customer.getCustomerDetails());
		Medicines medico = medUtils.findMed(medList);
		 this.soldmeds.add(medico);
		  
		   
         }
		

	}
	public static Customer getCustomerDetails() {
		sc.nextLine();
		System.out.println("Enter Customer Name");
		String name = sc.nextLine();

		System.out.println("Enter Customer Address");
		String address = sc.nextLine();

		System.out.println("Enter Phone Number");
		String phoneNumber = sc.nextLine();

		System.out.println("Enter Doctors Name");
		String doctorName = sc.nextLine();

		


		Customer customer = new Customer(name, address, phoneNumber, doctorName);
		return customer;
	}
  public void printCust(List<Customer>customers) {
	  for(Customer cus : customers) {
	  System.out.println(customers);
		  for(Medicines meds : soldmeds) {
			  System.out.println(meds);
		  
		  }
	  }
  }
@Override
public String toString() {
	return "Customer [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", doctorName="
			+ doctorName + ", totalAmount=" + totalAmount + ", soldmeds=" + soldmeds + "," + "]";
}
  



}

