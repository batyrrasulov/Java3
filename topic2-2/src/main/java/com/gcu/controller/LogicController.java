package com.gcu.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

// This should be a different import
import jakarta.validation.Valid;

@Controller
@RequestMapping("/login")
public class LogicController {
// step 5
	@GetMapping("/")
	public String display(Model model) {
		// Display login form view
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		// Check for validation errors
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		// Print the form values out
		System.out.println(String.format("Form with Username of %s and password of %s", loginModel.getUsername(), loginModel.getPassword()));
		// Navigate back to the Login View
		
		// Create some Orders
		List<OrderModel> orders = new ArrayList<OrderModel>();
		
		orders.add(new OrderModel(0L, "00000000001", "Product 1", 1.00f, 1));
		orders.add(new OrderModel(1L, "00000000002", "Product 2", 2.00f, 2));
		orders.add(new OrderModel(2L, "00000000003", "Product 3", 3.00f, 3));
		orders.add(new OrderModel(3L, "00000000004", "Product 4", 4.00f, 4));
		orders.add(new OrderModel(4L, "00000000005", "Product 5", 5.00f, 5));
		
		// Display the Orders View
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		return "orders";
	}

	
}
