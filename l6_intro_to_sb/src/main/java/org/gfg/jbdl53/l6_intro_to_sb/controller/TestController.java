package org.gfg.jbdl53.l6_intro_to_sb.controller;

import org.gfg.jbdl53.l6_intro_to_sb.entity.Employee;
import org.gfg.jbdl53.l6_intro_to_sb.model.PostEmployeeRequestModel;
import org.gfg.jbdl53.l6_intro_to_sb.model.PostEmployeeResponseModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test")
public class TestController {
		@RequestMapping("/")
		public String test() {
			
			return "test harish "; 
			
		}
				
		@RequestMapping("/greet/{name}")
		public String greeting(@PathVariable String name) {
			
			return "Hello "+name; 
			
		}
		
		@RequestMapping("/greetRP")
		public String greetingRP(@RequestParam String name) {
			
			return "Hello, "+name; 
			
		}
		
		@PostMapping("/addEmployees")
		public PostEmployeeResponseModel[] addEmployee(@RequestBody PostEmployeeRequestModel[] emp) {
			System.out.println(emp+"by harish--");
			Employee[] e=new Employee[emp.length];
			PostEmployeeResponseModel[] postResponse=new PostEmployeeResponseModel[emp.length];
			for(int i=0;i<emp.length;i++)
			{
				e[i]=new Employee(emp[i].id,emp[i].name,emp[i].sal,emp[i].departmentName);
				postResponse[i]=new PostEmployeeResponseModel(e[i].id,e[i].name,e[i].sal,e[i].dept,200,"Success");
				System.out.println(postResponse[i]);
			}
			 
			System.out.println(postResponse);
			return postResponse;	
		}
}
















