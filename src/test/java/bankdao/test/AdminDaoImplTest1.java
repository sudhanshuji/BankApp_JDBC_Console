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

import bank.entity.Branch;
import bankdao.impl.AdminDaoImpl;

/**
 * @author saura
 *
 */
public class AdminDaoImplTest1 {
	static Branch branch;

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
		branch = new Branch("TestBranch", "Majhiaon", "SBIN0001", "Rural");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertBranch() {
		AdminDaoImpl admindao = new AdminDaoImpl();
		assertTrue(admindao.insertBranch(branch));
		
		

	}

}
