/**
 * 
 */
package bank.manager;

import bank.dao.UserDao;
import bank.entity.User;
import bankdao.impl.UserDaoImpl;

/**
 * @author saura
 *
 */
public class UserManagerImpl implements UserManager {

	@Override
	public boolean validateUser(String Password) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl();
		return userDao.insertUser(user);
		
	}
	

}
