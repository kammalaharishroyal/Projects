package org.gfg.jbdl53.l7_springboot_curd_on_employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/crud")
public class CURDController {

		List<String> l=new ArrayList<String>();
		
		@GetMapping("/")
		public String test() {
			return "test api working";
		}
		
		@GetMapping("/load")
		public String loadNames() {
		
			l.add("Harish");
			l.add("pavan");
			
			return "load successful "+l.get(0)+" "+l.get(1);
			
		}
		
		@GetMapping("/addname/{name}")
		public String addname(@PathVariable String name) {
			if(name==null) {
				return "path variable is missing";
			}
			
			l.add(name);
			System.out.println(l);
			return l.get(l.size()-1)+" is added sucussfully";
		}
		
		@GetMapping("/add")
		public String addNameUsingRequestMapping(@RequestParam String name) {
			if(name==null) {
				return "@RequestParam is missing";
			}
			l.add(name);
			
			return name+" added success";
		}
		@GetMapping("/getAllNames")
		public List<String> getAllNames(){
			if(l==null || l.isEmpty()|| l.size()==0) {
				loadNames();
			}
			return l;
		}
		
		@GetMapping("/greet/{id}")
		public String greetUser(@PathVariable int id){
			
			if(id>l.size()-1) {
				return "Hello Guest";
			}
			return "Hello "+l.get(id);
		}
		
}
