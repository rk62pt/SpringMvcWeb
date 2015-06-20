package main.ryan.bulletin.presentation;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bulletin")
public class BulletinController {

	@RequestMapping(value="bulletin",method=RequestMethod.GET)
	public String bulletin(){ 
		try{
			
		}catch(Exception e){
			
		}
		
		return "bulletin/bulletin";
	}
}
