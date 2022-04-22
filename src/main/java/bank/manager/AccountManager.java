package bank.manager;

import bank.entity.Account;

public interface AccountManager {
	public boolean validateAccount(long accountNumber);
	public boolean insertAccount(Account account);
}
