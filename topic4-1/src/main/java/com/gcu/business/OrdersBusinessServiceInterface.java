package com.gcu.business;


import java.util.List;

import org.springframework.web.context.annotation.SessionScope;

import com.gcu.model.OrderModel;


public interface OrdersBusinessServiceInterface {
	public void test();
    public List<OrderModel> getOrders();
    public void init();
    public void destroy();
	
}