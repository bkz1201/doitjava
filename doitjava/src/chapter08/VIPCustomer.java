package chapter08;

public class VIPCustomer extends Customer {
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;

	private int agentID;
	double saleRatio;

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
}
