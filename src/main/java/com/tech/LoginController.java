package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("LoginController constructor");
	}
	
	@RequestMapping("/login")
	public ModelAndView valid(@RequestParam("uname") String uname,
			@RequestParam("password") String pass) {
		System.out.println("inside valid method");
		System.out.println(uname+"--"+pass);
		
		if (uname.equals("admin") && pass.equals("admin123")) {
			
			System.out.println("login sucecss");
			ModelAndView mav = new ModelAndView("succ");
			mav.addObject("UNAME",uname);
			return mav;
		}else {
			
			System.out.println("login fail");
			
			ModelAndView mav=new ModelAndView("fail");
			mav.addObject("UNAME",uname);
			return mav;
		}
	}
}
