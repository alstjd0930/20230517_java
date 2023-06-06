package home_java;


public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUser(String userID)throws IDFormatException{
		if(userID==null) {
			throw new IDFormatException("아이디는 null일수 없음");
		}
		else if(userID.length()<8|| userID.length()>20) {
			throw new IDFormatException("아이디는 8자리 이상 20자 이하");
		}
		this.userID=userID;
	}
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		try {
			test.setUser(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		userID="1234567";
		try {
			test.setUser(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
