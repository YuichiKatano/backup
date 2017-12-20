package com.internousdev.travel.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.travel.dao.BuyItemCompleteDAO;
import com.internousdev.travel.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware{

	public Map<String, Object>session;

	private BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();

	public String execute() throws SQLException{

		BuyItemDTO DTO = (BuyItemDTO) session.get("DTO");

		buyItemCompleteDAO.buyItemInfo(
				//DTO.getId(),
				//int totalPrice = Integer.parseInt(buyItemDTO.getItemPrice()) * count;
				session.get("item_transaction_id").toString(),
				session.get("total_count").toString(),
				session.get("total_price").toString(),
				session.get("user_master_id").toString(),
				session.get("pay").toString());

		System.out.println(DTO.getId());



		String result=SUCCESS;
		return result;


	}

	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}
