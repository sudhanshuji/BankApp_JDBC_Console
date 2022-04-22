package bank.manager;

import bank.entity.Customer;

public interface CustomerManager {
	public boolean validateCustomer(long customerId);
	public boolean insertCustomer (Customer customer);
}
