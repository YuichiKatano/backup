package com.internousdev.travel.dto;

public class BuyItemDTO {

	public String id;
	public String item_name;
	public String item_price;

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getItem_name(){
		return item_name;
	}

	public void setItem_name(String item_name){
		this.item_name=item_name;
	}

	public String getItem_price(){
		return item_price;
	}
	public void setItem_price(String item_price){
		this.item_price=item_price;
	}

}
