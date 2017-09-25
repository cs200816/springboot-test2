package cs.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cs.test.entity.SysUser;
import cs.test.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/find/{name}")
	public String getUser(@PathVariable("name")String name,Model model){
		SysUser user=userService.getByName(name);
		model.addAttribute("user", user);
		return "user";
	}
}
