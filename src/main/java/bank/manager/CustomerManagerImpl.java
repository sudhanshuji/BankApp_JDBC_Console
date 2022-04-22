/**
 * 
 */
package bank.manager;

import bank.dao.CustomerDao;
import bank.entity.Customer;
import bankdao.impl.CustomerDaoImpl;

/**
 * @author saura
 *
 */
public class CustomerManagerImpl implements CustomerManager {

	@Override
	public boolean validateCustomer(long customerId) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		CustomerDao customerDao = new CustomerDaoImpl();
		return customerDao.insertCustomer(customer);
		
	}

}
