package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	
	public static void main(String[] args) {

//어레이리스트 사용할거고 / 타입 / 변수명           / 어레이리스트 객체/ 타입
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10001, "이훤");
		Customer customerShin = new Customer(10002, "신동");
		GoldCustomer customerHong = new GoldCustomer(10003, "홍두깨");
		GoldCustomer customerJean = new GoldCustomer(10004, "전소연");
		VIPCustomer customerKim = new VIPCustomer(10005, "김연아", 1);
		VIPCustomer customerYoung = new VIPCustomer(10006, "용", 2);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJean);
		customerList.add(customerKim);
		customerList.add(customerYoung );
		
		System.out.println("=========고객정보 출력 ========");
		for(Customer customer:customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==========할인율과 보너스포인트 결과======");
		int price = 10000;
		for(Customer customer : customerList){
			
			int cost = customer.calPrice(price);
			
			System.out.println(customer.getCustomerName()+" 님이 "+cost +"를 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}	
	}
}
