package com.gcu.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

// This should be a different import
import jakarta.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {
	

		@Autowired
	private OrdersBusinessServiceInterface service;
	
    @Autowired
    private SecurityBusinessService security;
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		
		System.out.println(String.format("Form with Username of %s and password of %s", loginModel.getUsername(), loginModel.getPassword()));
	
		List<OrderModel> orders = service.getOrders();
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		service.test(); 	
		return "orders";
	}

	
}
