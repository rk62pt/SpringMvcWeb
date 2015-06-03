package main.ryan.test.presentation;

import java.util.List;

import main.ryan.test.business.TestManager;
import main.ryan.test.business.vo.TestVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestManager testService;
	
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index(Model model){ 
		try{
			List<TestVO> voList = testService.search();
			model.addAttribute("list",voList);
		}catch(Exception e){
			
		}
		
		return "index";
	}
}
