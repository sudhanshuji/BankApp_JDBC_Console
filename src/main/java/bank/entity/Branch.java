package bank.entity;

public class Branch {
	private String branchCode;
	private String branchAddress;
	private String ifscCode;
	private String branchType;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(String branchCode, String branchAddress, String ifscCode, String branchType) {
		super();
		this.branchCode = branchCode;
		this.branchAddress = branchAddress;
		this.ifscCode = ifscCode;
		this.branchType = branchType;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	
	
	

}
