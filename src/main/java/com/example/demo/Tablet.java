package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Tablet implements Gadgets {
	public String display() {
		return "Tablet name is iPad";
	}
}
	