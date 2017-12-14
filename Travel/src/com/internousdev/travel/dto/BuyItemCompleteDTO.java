package com.internousdev.travel.dto;

public class BuyItemCompleteDTO {

	private int item_transaction_id;

	private int total_price;

	private int total_count;

	private String user_master_id;

	private String pay;

	public int getItem_transaction_id(){
		return item_transaction_id;
	}

	public void setItem_transaction_id(int item_transaction_id){
		this.item_transaction_id=item_transaction_id;
	}

	public int getTotal_price(){
		return total_price;
	}
	public void setTotal_price(int total_price){
		this.total_price=total_price;
		}

	public int getTotal_count(){
		return total_count;
	}

	public void setTotal_count(int total_count){
		this.total_count=total_count;
	}

	public String getUser_master_id(){
		return user_master_id;
	}

	public void setUser_master_id(String user_master_id){
		this.user_master_id=user_master_id;
	}

	public String getPay(){
		return pay;
	}

	public void setPay(String pay){
		this.pay=pay;
	}


}
