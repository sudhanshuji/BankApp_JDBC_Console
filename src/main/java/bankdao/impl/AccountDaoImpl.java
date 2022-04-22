package bankdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bank.dao.AccountDao;
import bank.dao.DBUtil;
import bank.entity.Account;
import bank.exception.DBUtilExceptions;

public class AccountDaoImpl implements AccountDao {
	String sql="";
	@Override
	public boolean insertAccount(Account accountDetails) {
		// TODO Auto-generated method stub
		int result = 0;

		sql = "insert into account Values (?,?,?,?,?)";
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setLong(1, accountDetails.getAccountNumber());
			ps.setString(2, accountDetails.getAccountType());
			
			ps.setString(3, accountDetails.getBranchCode());
			ps.setInt(4, accountDetails.getBalance());
			ps.setString(5, accountDetails.getStatus());

			result = ps.executeUpdate();

		} catch (DBUtilExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 1) {
//			System.out.println("Branch created successfully");
			return true;
		} else
			return false;

	}

}
