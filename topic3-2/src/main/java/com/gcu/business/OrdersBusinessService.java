package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void test() {
		System.out.println("hello (OrdersBusinessService)");
		
		
	}

    @Override
    public List<OrderModel> getOrders() {
        List<OrderModel> orders = new ArrayList<OrderModel>();
        orders.add(new OrderModel(0L, "001", "Product 1", 500.0f, 1));
        orders.add(new OrderModel(1L, "002", "Product 2", 350.0f, 2));
        orders.add(new OrderModel(2L, "003", "Product 3", 800.0f, 1));
        orders.add(new OrderModel(3L, "004", "Product 4", 600.0f, 1));
        orders.add(new OrderModel(4L, "005", "Product 5", 250.0f, 2));
        orders.add(new OrderModel(5L, "006", "Product 6", 100.0f, 4));
        orders.add(new OrderModel(6L, "007", "Product 7", 1200.0f, 1));
        orders.add(new OrderModel(7L, "008", "Product 8", 700.0f, 1));
        orders.add(new OrderModel(8L, "009", "Product 9", 900.0f, 2));
        orders.add(new OrderModel(9L, "010", "Product 10", 300.0f, 2));
        orders.add(new OrderModel(10L, "011", "Product 11", 400.0f, 2));
        orders.add(new OrderModel(11L, "012", "Product 12", 150.0f, 3));
        orders.add(new OrderModel(12L, "013", "Product 13", 1600.0f, 1));
        orders.add(new OrderModel(13L, "014", "Product 14", 900.0f, 1));
        orders.add(new OrderModel(14L, "015", "Product 15", 100.0f, 4));
        orders.add(new OrderModel(15L, "016", "Product 16", 500.0f, 2));
        orders.add(new OrderModel(16L, "017", "Product 17", 250.0f, 3));
        orders.add(new OrderModel(17L, "018", "Product 18", 350.0f, 1));
        orders.add(new OrderModel(18L, "019", "Product 19", 800.0f, 1));
        orders.add(new OrderModel(19L, "020", "Product 20", 50.0f, 5));
        return orders;
    }

	@Override
	public void init() { 
		System.out.println("Hello from OrdersBusinessService init()");
		
	}

	@Override
	public void destroy() {
		System.out.println("Hello from OrdersBusinessService destroy()");
		
	}
	
}
