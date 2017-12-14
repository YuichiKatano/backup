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

		BuyItemDTO buyItemDTO = (BuyItemDTO) session.get("buyItemDTO");

		buyItemCompleteDAO.buyItemInfo(
				buyItemDTO.getId(),
				session.get("count").toString(),
				session.get("totalPrice").toString(),
				session.get("user_master_id").toString(),
				session.get("pay").toString());




		String result=SUCCESS;
		return result;


	}

	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}