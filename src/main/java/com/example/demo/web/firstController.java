package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Controller1")
public class firstController {
	@GetMapping("/welcome")
	public String display(Model model) {
		
		
		model.addAttribute("message", "welcome to india");
		return "index";
		
		
	}

}
