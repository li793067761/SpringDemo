package com.galaxy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
@Controller
public class IndexController {

	@RequestMapping("/test")
	public String toIndex(Model model){
		model.addAttribute("message", "一个新页面!");
		return "showMessage";
	}
}
