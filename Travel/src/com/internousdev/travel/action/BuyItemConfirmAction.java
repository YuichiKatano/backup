package com.internousdev.travel.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.travel.dao.BuyItemCompleteDAO;
import com.internousdev.travel.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	private String country;

	private int item_transaction_id;


	private int price;

	private int count;

	private String payment;

	private String user_master_id;


	public Map<String,Object> session;

	private BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();




	public String execute() throws SQLException{


		if(payment.equals("1")) {

			payment = "現金払い";
		} else {

			payment = "クレジットカード";

		}

/*
		if(country.equals("japan")){
			country="日本";
			price=count*30000;
		}else if(country.equals("korea")){
			country="韓国";
			price=count*30000;
		}else if(country.equals("aus")){
			country="オーストラリア";
			price=count*50000;
		}else if(country.equals("usa")){
			country="アメリカ";
			price=count*80000;
		}else{
			country="カナダ";
			price=count*70000;
		}
*/

		// 商品情報を持っているBuyItemDTOをSessionから取り出します。
		// sessionから情報を取り出すと"Object型"データになっているので"BuyItemDTO型"情報に変換します。
		BuyItemDTO buyItemDTO = (BuyItemDTO) session.get("buyItemDTO");

		// 合計金額を保存する変数を作ります。
		// Integer.parseInt(String型の情報) -> String型情報をint型に変換する。
		int totalPrice = Integer.parseInt(buyItemDTO.getItemPrice()) * count;

		session.put("totalPrice", totalPrice);




	//			session.put("item_transaction_id",item_transaction_id);
	//			session.put("price",price);
				session.put("count",count);
				session.put("pay",payment);
	//			session.put("user_master_id",user_master_id);
	//			session.put("country",country);



		String result=SUCCESS;
		return result;
	}

	public int getItem_transaction_id(){
		return item_transaction_id;
	}

	public void setItem_transaction_id(int item_transaction_id){
		this.item_transaction_id=item_transaction_id;
	}

	public String getUser_master_id(){
		return user_master_id;
	}

	public void setUser_master_id(String user_master_id){
		this.user_master_id=user_master_id;
	}

	public String getCountry(){
		return country;
	}

	public void setCountry(String country){
		this.country=country;
	}

	public int getPrice(){
		return price;
	}

	public void setPrice(int price){
		this.price=price;
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
