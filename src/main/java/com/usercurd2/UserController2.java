package com.usercurd2;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController2 {
	
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String webapp() {
		return "Web";
	}
	
	@RequestMapping("/homesave")
	public String home() {
		return "redirect:/";
	}
	
	@GetMapping("/register")
	public String newRegister (Model model) {
		model.addAttribute("userclass",new UserClass());
		return "Register";
	}
	
	@GetMapping("/saveuser")
	public String saveUserData (UserClass userclass) {
		userService.saveUser(userclass);
		return "redirect:/users";
	}
	
	@RequestMapping("/users")
	public String usersList (Model model) {
		List<UserClass>userclass = userService.getUserDetails();
		model.addAttribute("userclass" ,userclass);
		return "Users";
	}
	
	@GetMapping("/login")
	public String logIn () {
		return "Home2";
	}
	
	// Editing the Existing user 
	
	@RequestMapping("/edit/{userid}")
	public String editUser(@PathVariable Integer userid, Model model) {
		UserClass userclass = userService.edituser(userid);
		model.addAttribute("userclass",userclass);	
		return "EditUser";	
	}
	
	@RequestMapping("/delete/{userid}") 
	public String delete(@PathVariable Integer userid) {
		userService.deleteUser(userid);
		return "redirect:/users";
		}
}
