package bank.manager;

import bank.entity.User;

public interface UserManager {
	public boolean validateUser(String Password);
	public boolean insertUser (User user);
}
