package com.internousdev.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.travel.dto.LoginConfirmDTO;
import com.internousdev.travel.util.DBConnector;

public class LoginConfirmDAO {


	public String username;
	public String password;

	public List<LoginConfirmDTO> loginConfirmDTOList=new ArrayList<LoginConfirmDTO>();

	public List<LoginConfirmDTO> select(String login_id, String login_pass){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();


	String sql="select * from login_user_transaction where login_id=? and login_pass=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, login_id);
		ps.setString(2, login_pass);
		ResultSet rs=ps.executeQuery();

		while(rs.next()){
			LoginConfirmDTO dto=new LoginConfirmDTO();
			dto.setUsername(rs.getString("user_name"));
			dto.setPassword(rs.getString("login_pass"));
			dto.setId(rs.getString("login_id"));
			loginConfirmDTOList.add(dto);
		}

		if(loginConfirmDTOList.size()<=0){
			LoginConfirmDTO dto=new LoginConfirmDTO();
			dto.setUsername("該当なし");
			dto.setPassword("該当なし");
			loginConfirmDTOList.add(dto);
		}
	}catch (SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return loginConfirmDTOList;
	}

}
