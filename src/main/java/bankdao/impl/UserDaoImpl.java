package bankdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bank.dao.DBUtil;
import bank.dao.UserDao;
import bank.entity.User;
import bank.exception.DBUtilExceptions;

public class UserDaoImpl implements UserDao {
	String sql="";
	@Override
	public boolean insertUser(User userDetails) {
		// TODO Auto-generated method stub
		int result = 0;

		sql = "insert into user Values (null,?,?,?)";
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

		//	ps.setInt(1, null/*userDetails.getUserId()*/);
			ps.setString(1, userDetails.getUserName());
			ps.setString(2, userDetails.getPassword());
			ps.setString(3, userDetails.getUserType());

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
