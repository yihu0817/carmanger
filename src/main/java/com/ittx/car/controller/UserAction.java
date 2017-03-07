package com.ittx.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ittx.car.model.User;
import com.ittx.car.service.SecureService;

@Controller
public class UserAction {
	@Autowired
	private SecureService secureService;
	
	@RequestMapping(value="login")
	public String login(Model model){
		return "login";
	}
	
	@RequestMapping(value="login_submit")
	public String loginSubmit(User user ,Model model){
		if(secureService.login(user) == null){
			model.addAttribute("error", "用户名密码不正确或审核未通过！");
			return "login";
		}
		return "main";
	}
	
}
