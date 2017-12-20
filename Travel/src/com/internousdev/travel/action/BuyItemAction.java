package com.internousdev.travel.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.travel.dao.BuyItemDAO;
import com.internousdev.travel.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	private int id;
	private String item_name;
	private String item_price;

	private String pay;
	public Map<String, Object>session;
	private List<BuyItemDTO> buyItemDTOList=new ArrayList<BuyItemDTO>();


	public String execute(){
		String result=SUCCESS;

		// 商品の情報が保管されているMysqlのテーブルから情報を取得しにいきます。
		// その為にまずは、DAO（Mysqlとやり取りを行うクラス）のコピーを作ります。
		BuyItemDAO buyItemDAO = new BuyItemDAO();


		// DAOから戻してもらえるDTO型の結果（データ）を受け取るためにDTO型の変数を用意
		BuyItemDTO buyItemDTO = new BuyItemDTO();


		// コピーからメソッド（処理）を呼び出してMysqlからデータを取得します。
		//buyItemDTO =  buyItemDAO.getBuyItemInfo();
//		buyItemDTOList=buyItemDAO.select(id,item_name,item_price);
		buyItemDTOList=buyItemDAO.selectAll();

		// DTO中に入っているデータは他のJavaクラスで利用するかもしれないので、共通で使える箱にいれます。
		session.put("buyItemDTO", buyItemDTOList);

		return result;

	}






	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}






	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}






	/**
	 * @return item_name
	 */
	public String getItem_name() {
		return item_name;
	}






	/**
	 * @param item_name セットする item_name
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}






	/**
	 * @return item_price
	 */
	public String getItem_price() {
		return item_price;
	}






	/**
	 * @param item_price セットする item_price
	 */
	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}






	/**
	 * @return buyItemDTOList
	 */
	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}






	/**
	 * @param buyItemDTOList セットする buyItemDTOList
	 */
	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}






	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}






	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
