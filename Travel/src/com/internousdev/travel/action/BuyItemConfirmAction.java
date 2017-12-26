package com.internousdev.travel.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.travel.dao.BuyItemCompleteDAO;
import com.internousdev.travel.dao.BuyItemDAO;
import com.internousdev.travel.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	private String id;

	private String item_transaction_id;


	private String item_price;

	private int count;

	private String payment;

	private String user_master_id;


	public Map<String,Object> session;

	private BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();

	BuyItemDAO buyItemDAO = new BuyItemDAO();




	public String execute() throws SQLException{

		if(payment.equals("1")) {

			payment = "現金払い";
		} else {

			payment = "クレジットカード";

		}




		// 商品情報を持っているBuyItemDTOをSessionから取り出します。
		// sessionから情報を取り出すと"Object型"データになっているので"BuyItemDTO型"情報に変換します。
		//BuyItemDTO buyItemDTO = (BuyItemDTO) session.get("buyItemDTO");

		// 合計金額を保存する変数を作ります。
		// Integer.parseInt(String型の情報) -> String型情報をint型に変換する。
		//int totalPrice = Integer.parseInt(buyItemDTO.getItemPrice()) * count;



		BuyItemDTO dto = new BuyItemDTO();



			dto = buyItemDAO.getBuyItemInfo(id);





		System.out.println(dto.getItem_name());

				session.put("id",dto.getId());
				session.put("item_name",dto.getItem_name());
				session.put("total_price", dto.getItem_price());
				session.put("total_count",count);
				session.put("pay",payment);






		String result=SUCCESS;
		return result;
	}

	public String getItem_transaction_id(){
		return item_transaction_id;
	}

	public void setItem_transaction_id(String item_transaction_id){
		this.item_transaction_id=item_transaction_id;
	}

	public String getUser_master_id(){
		return user_master_id;
	}

	public void setUser_master_id(String user_master_id){
		this.user_master_id=user_master_id;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getItem_Price(){
		return item_price;
	}

	public void setItem_Price(String item_price){
		this.item_price=item_price;
	}

	public int getCount(){
		return count;
	}

	public void setCount(int count){
		this.count=count;
	}

	public String getPayment(){
		return payment;
	}

	public void setPayment(String payment){
		this.payment=payment;
	}

	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}
