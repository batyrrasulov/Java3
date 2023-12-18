package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;

import com.gcu.model.OrderModel;

@Service
public class OrdersDataService implements DataAccessInterface {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	/**
	 * Non-default constructor for constructor injection
	 */
	public OrdersDataService(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	/**
	 * CRUD: finder to return all entities
	 */
	public List<OrderModel> findAll() {
		String sql = "SELECT * FROM ORDERS";
		List<OrderModel> orders = new ArrayList<OrderModel>();
		try {
			// execute SQL Query and loop over result set
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			while(srs.next()) {
				orders.add(new OrderModel(srs.getLong("ID"),
						srs.getString("ORDER_NO"),
						srs.getString("PRODUCT_NAME"),
						srs.getFloat("PRICE"),
						srs.getInt("QUANTITY")));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	@Override
	public OrderModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * CRUD: create an entity
	 */
	public boolean create(OrderModel order) {
		String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?, ?, ?, ?)";
		try {
			// execute SQL Insert
			int rows = jdbcTemplateObject.update(sql, 
					order.getOrderNo(),
					order.getProductName(),
					order.getPrice(),
					order.getQuantity());
			// return result of Insert
			return rows == 1 ? true : false;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean update(OrderModel order) {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean delete(OrderModel order) {
		// TODO Auto-generated method stub
		return true;
	}
}

