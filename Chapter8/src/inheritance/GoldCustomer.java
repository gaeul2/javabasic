package inheritance;

public class GoldCustomer extends Customer{
	public GoldCustomer(int customerID, String customerName){
		super(customerID, customerName);
		bonusRatio = 0.02;

		
	}
	
	@Override
	public int calPrice(int price) {
		// TODO Auto-generated method stub
		return super.calPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	//보너스 더 적립
}
