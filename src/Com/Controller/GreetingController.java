package Com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class GreetingController {

	@RequestMapping("/greet")
	public ModelAndView m()
	{
		String msg="Welcome";
		
		return new ModelAndView("greeting","message",msg);
	}
}
