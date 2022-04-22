package bank.manager;

import bank.entity.Branch;

public interface BranchManager {
	public boolean validateIfscCode(String ifscCode);
	public boolean insertBranch (Branch branch);
	
}
