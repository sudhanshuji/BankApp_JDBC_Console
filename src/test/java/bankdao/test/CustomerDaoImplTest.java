package bankdao.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bank.entity.Customer;
import bankdao.impl.CustomerDaoImpl;

public class CustomerDaoImplTest {
	static Customer customer;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customer = new Customer(10828941, "Gaurav", 1234567890, "Majhiaon", 1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertCustomer() {
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		assertTrue(customerDao.insertCustomer(customer));
	}

}
