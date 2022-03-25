package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Laptop implements Gadgets {
	public String display() {
		return "Laptop name is hp";
	}
}
	