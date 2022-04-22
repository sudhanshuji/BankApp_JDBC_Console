package bankdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bank.exception.DBUtilExceptions;
import bank.dao.DBUtil;
import bank.dao.AdminDao;
import bank.entity.Branch;

public class AdminDaoImpl implements AdminDao {
	String sql = "";

	@Override
	public boolean insertBranch(Branch branchDetails) {
		// TODO Auto-generated method stub
		int result = 0;

		sql = "insert into branch Values (?,?,?,?)";
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, branchDetails.getBranchCode());
			ps.setString(2, branchDetails.getBranchAddress());
			ps.setString(3, branchDetails.getIfscCode());
			ps.setString(4, branchDetails.getBranchType());

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
