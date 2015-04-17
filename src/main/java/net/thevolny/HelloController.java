package net.thevolny;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String printHello(@RequestParam(value = "name", defaultValue = "world") String name, Model model) {
		model.addAttribute("message", String.format("Hello %s!", name));
		return "hello/success";
	}

}