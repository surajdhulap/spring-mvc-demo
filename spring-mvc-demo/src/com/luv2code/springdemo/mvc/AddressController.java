package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
public class AddressController {

	@RequestMapping("/studentAddress")
	public String getAddress(Model theModel) {
		// checkout suraj branch
		StudentAddress address = new StudentAddress();
		theModel.addAttribute("address", address);
		return "address";
		
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute ("address") StudentAddress address) {
		return "address-confirmation";
	}
}
