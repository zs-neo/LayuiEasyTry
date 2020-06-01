package cn.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control")
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		return "index";
	}
	
	@RequestMapping("/exit")
	public String exit() {
		return "login";
	}
	
	@RequestMapping("/toDept")
	public String toDept() {
		return "allDepts";
	}
	
	@RequestMapping("/toDeptEdit")
	public String toDeptEdit() {
		return "deptEdit";
	}
	
}
