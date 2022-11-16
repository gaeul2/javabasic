package inheritance;

public class OverrindingTest {

	public static void main(String[] args) {

//		Customer customerChoi = new Customer(10100, "Lee");
//		int price = customerChoi.calPrice(10000);
//		System.out.println("지불 금액은 " +price + "이고, "+ customerChoi.showCustomerInfo());
//	
//		VIPCustomer customerBaek = new VIPCustomer(11001, "Baek", 1);
//		price = customerBaek.calPrice(10000);
//		System.out.println("지불 금액은 " +price + "이고, "+ customerBaek.showCustomerInfo());
//	
		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		int price = customerWho.calPrice(10000);
		System.out.println("지불금액은 " +price +"이고, " + customerWho.showCustomerInfo());

		Customer customerGold = new GoldCustomer();
		System.out.println(customerGold.showCustomerInfo());
	}
	

}
