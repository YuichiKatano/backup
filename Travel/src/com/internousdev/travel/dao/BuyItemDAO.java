package com.internousdev.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.travel.dto.BuyItemDTO;
import com.internousdev.travel.util.DBConnector;

public class BuyItemDAO {

	private DBConnector dbConnector=new DBConnector();

	private Connection connection=dbConnector.getConnection();

	private BuyItemDTO buyItemDTO=new BuyItemDTO();

	public List<BuyItemDTO> buyItemDTOList=new ArrayList<BuyItemDTO>();

	public List<BuyItemDTO> select(int id,String item_name,String item_price){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		return buyItemDTOList;
	}

	public List<BuyItemDTO> selectAll(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select id,item_name,item_price from item_info_transaction";

		try{
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				buyItemDTO=new BuyItemDTO();
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItem_name(resultSet.getString("item_name"));
				buyItemDTO.setItem_price(resultSet.getString("item_price"));
				buyItemDTOList.add(buyItemDTO);

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return buyItemDTOList;
	}


	public BuyItemDTO getBuyItemInfo(String item_name){
		String sql="select id,item_name,item_price from item_info_transaction WHERE id = ?";

		BuyItemDTO dto = new BuyItemDTO();
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, item_name);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				dto.setId(resultSet.getInt("id"));
				dto.setItem_name(resultSet.getString("item_name"));
				dto.setItem_price(resultSet.getString("item_price"));

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}

	public BuyItemDTO getBuyItemDTO(){
		return buyItemDTO;
	}

}
