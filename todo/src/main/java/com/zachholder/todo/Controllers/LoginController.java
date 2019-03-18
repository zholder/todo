package com.zachholder.todo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value = "login")
public class LoginController {
	
	@RequestMapping(value="")
    public String login(Model model) {  
    	model.addAttribute("title", "Login to Grocery List");

        return "login/login";
    }



}
