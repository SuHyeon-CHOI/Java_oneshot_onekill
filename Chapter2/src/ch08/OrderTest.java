package ch08;

public class OrderTest {

	public static void main(String[] args) {
		
		Order user1 = new Order ();
		user1.userHeight = 180;
		user1.userWeight = 78;
		user1.userGender = "남성";
		user1.userName = "Tomas";
		user1.userAge = 37;
		
		System.out.println(user1.showOrderInfo());

	}

}