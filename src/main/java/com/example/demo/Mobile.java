package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Mobile implements Gadgets {
	public String display() {
		return "Mobile name is samsung";
		
	}
	

}
