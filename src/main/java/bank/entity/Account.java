package bank.entity;

public class Account {
	private long accountNumber;
	private String accountType;
	
	private String BranchCode;
	private Integer balance;
	private String status;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long accountNumber, String accountType, String branchCode, Integer balance,
			String status) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		
		BranchCode = branchCode;
		this.balance = balance;
		this.status = status;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	

	public String getBranchCode() {
		return BranchCode;
	}

	public void setBranchCode(String branchCode) {
		BranchCode = branchCode;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
