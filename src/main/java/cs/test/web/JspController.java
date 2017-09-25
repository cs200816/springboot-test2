package cs.test.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class JspController {

	@RequestMapping("jsp")
	public String testJsp(){
		System.out.println("testJsp");
		return "test";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JspController.class, args);
	}
}
