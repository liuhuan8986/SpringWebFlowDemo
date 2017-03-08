package liuhuan.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String redirectToFlow() {
		//这里返回的名字是流程id
		return "redirect:/pizza"; 
	}
	
}
