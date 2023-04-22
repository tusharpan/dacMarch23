package com.warehouse.esentials;

import java.util.ArrayList;
import java.util.List;

import com.warehouse.customerEssentials.Customer;

public class Main {
	public static void main(String[] args) {
		System.out.println("welcome1");
		List<Medicines> medlist = new ArrayList<>() ;
		List<Customer> customers = new ArrayList<>();
		medUtils.addMEds(medlist);
		for (Medicines meds : medlist) {
			System.out.println(meds.toString());
		}
		System.out.println("welcome2");
		Customer c = new Customer();
		c.createBill(medlist,customers);
		System.out.println("welcome3");
		c.printCust(customers);
	}

	
	
}
