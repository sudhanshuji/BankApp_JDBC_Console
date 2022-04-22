/**
 * 
 */
package bankdao.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bank.entity.Account;
import bankdao.impl.AccountDaoImpl;

/**
 * @author saura
 *
 */
public class AccountDaoImplTest {
	static Account account;

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
		account = new Account(1234567890,"Saving","TestBranch", 10000000, "Active");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link bankdao.impl.AccountDaoImpl#insertAccount(bank.entity.Account)}.
	 */
	@Test
	public void testInsertAccount() {
		AccountDaoImpl accountDao = new AccountDaoImpl();
		assertTrue(accountDao.insertAccount(account));
	}

}
