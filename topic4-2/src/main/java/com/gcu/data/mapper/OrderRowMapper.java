package com.gcu.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.data.entity.OrderEntity;

public class OrderRowMapper implements RowMapper<OrderEntity> {
    public OrderEntity mapRow(ResultSet rs, int rowNumber) throws SQLException {
        OrderEntity order = new OrderEntity();
        order.setId(rs.getLong("ID"));
        order.setOrderNo(rs.getString("ORDER_NO"));
        order.setProductName(rs.getString("PRODUCT_NAME"));
        order.setPrice(rs.getFloat("PRICE"));
        order.setQuantity(rs.getInt("QUANTITY"));
        return order;
    }
}
