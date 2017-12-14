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
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				buyItemDTOList.add(buyItemDTO);

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return buyItemDTOList;
	}


	public BuyItemDTO getBuyItemInfo(){
		String sql="select id,item_name,item_price from item_info_transaction";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return buyItemDTO;
	}

	public BuyItemDTO getBuyItemDTO(){
		return buyItemDTO;
	}

}