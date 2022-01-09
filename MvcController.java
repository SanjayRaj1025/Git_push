package com.techno.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techno.springmvc.model.Register;
import com.techno.springmvc.service.MvcService;

@Controller
public class MvcController {
	@RequestMapping("/home")
	public String home() {
		return "home";

	}

	@RequestMapping("/login")
	public String login() {
		return "login";

	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	// @RequestMapping("/login")
	public String log(HttpServletRequest req) {
		String username = req.getParameter("user");
		String password = req.getParameter("password");

		if (username.isEmpty()){
			return "failure";
		}
		return "success";

	}
	
	@GetMapping("/register")
	public String reg() {
		return "register";
		
	}
	
	@Autowired
	MvcService service;
	
	
	
	@PostMapping("/register")
	public String Register(Register reg,ModelMap map) {
		map.addAttribute("details",reg);
		service.save(reg);
		return "success";
	}

}
