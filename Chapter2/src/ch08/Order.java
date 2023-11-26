package ch08;

public class Order {
	
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public int menuNumber;
	public int userHeight;
	public int userWeight;
	public String userGender;
	public String userName;
	public int userAge;
	
	public Order () {}
	
	public Order (int userHeight, int userWeight, String userGender, String userName, int userAge) {
		this.userHeight = userHeight;
		this.userWeight = userWeight;
		this.userGender = userGender;
		this.userName = userName;
		this.userAge = userAge;
	}
	
	public String showOrderInfo () {
		
		return "키가 " + userHeight + "이고 몸무게가 " + userWeight + "킬로인 "  + userGender + "이 있습니다. 이름은 " + userName + "이고 나이는 " + userAge + "세 입니다.";
	}

}
