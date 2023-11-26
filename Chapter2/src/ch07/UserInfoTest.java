package ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassWord = "z12345";
		userLee.userName = "Lee"; 
		userLee.phoneNumber = "01012345678";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345", "z12345", "Kim");
		System.out.println(userKim.showUserInfo());

	}

}
