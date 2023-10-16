package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

// Part 1-A



// Part 2-B
@Controller
@RequestMapping("/hello")

public class HelloWorldController {
	@GetMapping("/test1")
	@ResponseBody
	public String printHello() {
		// Return a string in the response body, using response body
		return "Hello World!";
	}

	
@GetMapping("/test2")
public String printHello(Model model) {
	// Return a string in the response body, using response body
	model.addAttribute("message", "Hello Spring MVC Framework");
	return "hello";
}

// Part 13
@GetMapping("/test3")
public ModelAndView printHello1() {
	// Create a ModelAndView and then set an attribute named message and with a View named hello
	ModelAndView mv = new ModelAndView();
	mv.addObject("message", new String("Hello World from ModelAndView!"));
	mv.addObject("message2", new String("Another Hello World from ModelAndView!"));
	mv.setViewName("hello");
	return mv;
	
}
/**
 * Simple hello world controller that returns a View Name
 *  along with a model attribute named message invoke using /test URI.
 *  @param message HTTP Parameter named message to add to the Model for rendering.
 *  @param model Model to bind to the View.
 *  
 *  @return View name hello
 */
@GetMapping("/test4")
public String printHello(@RequestParam("message") String message, Model model) {
	// Simply return a Model attribute named message and return a View named hello
	model.addAttribute("message", message);
	return "hello";
}

}
