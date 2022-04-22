package bankdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bank.dao.CustomerDao;
import bank.dao.DBUtil;
import bank.entity.Customer;
import bank.exception.DBUtilExceptions;

public class CustomerDaoImpl implements CustomerDao {
	String sql = "";
	@Override
	public boolean insertCustomer(Customer customerDetails) {
		// TODO Auto-generated method stub
		int result = 0;

		sql = "insert into customer Values (?,?,?,?,?)";
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setLong(1, customerDetails.getCustomerId());
			ps.setString(2, customerDetails.getName());
			ps.setLong(3, customerDetails.getAccountNumber());
			ps.setString(4, customerDetails.getAddress());
			ps.setInt(5, customerDetails.getUserId());

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
