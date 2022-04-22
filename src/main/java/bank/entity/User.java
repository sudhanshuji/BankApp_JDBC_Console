package bank.entity;

public class User {
//	private Integer userId;
	private String userName;
	private String password;
	private String userType;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User( String userName, String password, String userType) {
		super();
//		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}


//	public Integer getUserId() {
//		return userId;
//	}
//
//
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	

}
