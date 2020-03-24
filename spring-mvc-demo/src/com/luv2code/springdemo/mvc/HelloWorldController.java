package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// Need the controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	// Need a controller method to process the HTML form
	
	@RequestMapping("/processFrom")
	public String processForm() {
		return "HelloWorld";
	}
	
	// Need a controller method to read form data
	
	// Add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "YO! " +theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "HelloWorld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "YO! " +theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "HelloWorld";
	}
}
