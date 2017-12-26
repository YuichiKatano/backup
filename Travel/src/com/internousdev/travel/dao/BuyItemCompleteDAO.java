package com.internousdev.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.internousdev.travel.util.DBConnector;

public class BuyItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	private String sql = "INSERT INTO buy_item_transaction (item_transaction_id, total_count,  total_price, user_master_id, pay, insert_date, updated_date) VALUES(?,?, ?, ?, ?, ?, ?)";


	public void buyItemInfo(int item_transaction_id, String total_count, String total_price, String user_master_id, String pay) throws SQLException {

		// InsertDate と updateDateのカラムに値を入れるため、現在時刻を取得します。
		Date date = new Date();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, item_transaction_id);
			preparedStatement.setString(2, total_count);
			preparedStatement.setString(3, total_price);
			preparedStatement.setString(4, user_master_id);
			preparedStatement.setString(5, pay);

			// データがMySQLに登録される瞬間の時間を登録します。
			preparedStatement.setString(6, date.toString());
			preparedStatement.setString(7, date.toString());


			// 上でセットした値をbuy_item_transactionテーブルに保存します。
			preparedStatement.executeUpdate();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}

//

//