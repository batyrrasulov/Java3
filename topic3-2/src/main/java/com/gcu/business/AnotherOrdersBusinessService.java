package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void test() {
		System.out.println("hello (AnotherOrdersBusinessService)");
		
		
	}

	@Override
	public List<OrderModel> getOrders() {
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "001", "Product 1", 500.0f, 1));
        orders.add(new OrderModel(1L, "002", "Product 2", 350.0f, 2));
        orders.add(new OrderModel(2L, "003", "Product 3", 800.0f, 1));
        orders.add(new OrderModel(3L, "004", "Product 4", 600.0f, 1));
        orders.add(new OrderModel(4L, "005", "Product 5", 250.0f, 2));
		return orders;
	}

	@Override
	public void init() {
		System.out.println("Hello from AnotherOrdersBusinessService init()");
		
	}

	@Override
	public void destroy() {

		System.out.println("Hello from AnotherOrdersBusinessService destroy()");
		
		
	}

}
