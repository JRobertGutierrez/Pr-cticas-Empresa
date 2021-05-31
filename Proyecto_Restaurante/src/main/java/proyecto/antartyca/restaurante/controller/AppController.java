package proyecto.antartyca.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	@RequestMapping("/admin")
	public @ResponseBody String helloAdmin() {
		return "Welcome to Admin.";
	}
	
	@RequestMapping("/user")
	public @ResponseBody String helloUser() {
		return "Welcome to User.";
	}
}	