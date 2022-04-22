package bankdao.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import bank.entity.User;
import bankdao.impl.AdminDaoImpl;
import bankdao.impl.UserDaoImpl;

public class UserDaoImplTest1 {
	static User user;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		user = new User("Gaurav", "G123", "admin");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertUser() {
		UserDaoImpl userdao = new UserDaoImpl();
		assertTrue(userdao.insertUser(user));
		
		

	}



}
