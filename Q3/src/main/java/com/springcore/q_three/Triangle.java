package com.springcore.q_three;
import org.springframework.stereotype.Component;

@Component
public class Triangle 
{
	private String type;	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}    
}
