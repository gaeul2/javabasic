package test;

import inheritance.Customer;
import inheritance.VIPCustomer;

public class CustomerTest1 {

	public static void main(String[] args) {

//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("Lee");

		// 디폴트로 사용할때
//		VIPCustomer customerKim = new VIPCustomer();
//		customerKim.setCustomerID(10100);
//		customerKim.setCustomerName("Lee");
		// 내가 생성한 생성자 사용할때
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		customerKim.setBonusPoint(1000);
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
