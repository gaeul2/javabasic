package inheritance;

public class VIPCustomer extends Customer {
	/*단골고객
	 * 고객등급 VIP
	 * 제품구매 할인율 : 10%
	 * 보너스포인트 : 5%
	 * 담당전문 상담원 배정*/
	private int agentID; //전문상담원 ID
	private double saleRatio; // 할인율
	
//	public VIPCustomer() {
//		/*묵시적으로 여기 super();가 있음
//		 * 그러나 super()는 기본 Customer생성자를 호출
//		 * 만약 Customer에 생성자를 내가 직접 설정한것만 있다면 
//		 * 여기서도 그렇게 써줘야함.*/
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//	}
//	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		/*이렇게 써주면 참좋지!*/
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	//담당전문 상담원은 고정지정하여 보는것만 허용하겠다.
	public int getAgentID() {
		return agentID;
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}


}
