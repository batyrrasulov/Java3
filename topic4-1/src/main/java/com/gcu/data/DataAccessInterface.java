package com.gcu.data;

import java.util.List;

import com.gcu.model.OrderModel;

public interface DataAccessInterface <T> {
	public List<T> findAll();
	public T findById(int id);
	public boolean create(OrderModel order);
	public boolean update(OrderModel order);
	public boolean delete(OrderModel order);
}
