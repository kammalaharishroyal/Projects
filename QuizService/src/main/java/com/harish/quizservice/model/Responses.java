package com.harish.quizservice.model;

import jakarta.persistence.Id;


public class Responses {                                                                                 
	 @Id                                                                                                    
	private Integer id;                                                                                  
	private String response;                                                                             
	public Integer getId() {                                                                             
		return id;                                                                                       
	}                                                                                                    
	public void setId(Integer id) {                                                                      
		this.id = id;                                                                                    
	}                                                                                                    
	public String getResponse() {                                                                        
		return response;                                                                                 
	}                                                                                                    
	public void setResponse(String response) {                                                           
		this.response = response;                                                                        
	}                                                                                                    
	public Responses(Integer id, String response) {                                                      
		super();                                                                                         
		this.id = id;                                                                                    
		this.response = response;                                                                        
	}                                                                                                    
	public Responses() {                                                                                 
		super();                                                                                         
		// TODO Auto-generated constructor stub                                                          
	}                                                                                                    
	                                                                                                     
	                                                                                                     
	                                                                                                     
                                                                                                         
}                                                                                                        
                                                                                                         