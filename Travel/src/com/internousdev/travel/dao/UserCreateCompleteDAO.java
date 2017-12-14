package com.internousdev.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.travel.util.DBConnector;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	private String sql="insert into login_user_transaction(login_id,login_pass,user_name) values(?,?,?)";

	public void createUser(String loginUserId,String loginPassword, String userName) throws SQLException{

	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,loginUserId);
		preparedStatement.setString(2,loginPassword);
		preparedStatement.setString(3,userName);


		preparedStatement.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		connection.close();
	}
}
}
