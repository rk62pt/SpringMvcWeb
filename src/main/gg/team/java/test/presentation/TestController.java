package main.gg.team.java.test.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index(){ 
		
		return "index";
	}
}
