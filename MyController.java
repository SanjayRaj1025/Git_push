package com.techno.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/test")
	public String test(Model model) {

		String a = "Sanjay";
		model.addAttribute("name", a);

		return "test";

	}

	@GetMapping("/test2")
	public String test2(ModelMap map) {
		String s = "Raj";
		map.addAttribute("name", s);
		return "test";
	}
	
//	@GetMapping("/test3")
//	public ModelAndView test3(ModelAndView mav) {
//		String s="Brock leasner";
//		mav.addObject("name",s);
//		mav.setViewName("test");
//		return mav;
//	}

}
