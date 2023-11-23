package org.gfg.jbdl53.l6_intro_to_sb.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class CURDController {
	List<String> l=new ArrayList<>();
	
	@GetMapping("/")
	public String test()
	{
		return "hai harish";
	}
	@GetMapping("/load")
	public String loadNames() {
		//nameList = new ArrayList<>();
		l.add("David");
		l.add("John");
		l.add("Ron");
		l.add("Vikas");
		l.add("Anand");
		
		return "Load Successful!";
	}

}
