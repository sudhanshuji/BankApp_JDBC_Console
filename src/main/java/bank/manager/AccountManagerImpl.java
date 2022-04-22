/**
 * 
 */
package bank.manager;

import bank.dao.AccountDao;
import bank.entity.Account;
import bankdao.impl.AccountDaoImpl;

/**
 * @author saura
 *
 */
public class AccountManagerImpl implements AccountManager {

	@Override
	public boolean validateAccount(long accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAccount(Account account) {
		// TODO Auto-generated method stub
		AccountDao accountDao = new AccountDaoImpl();
		return accountDao.insertAccount(account);
		
	}

}
