package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
@Autowired
@Qualifier("mobile")
private Gadgets gd; 
/*
@Autowired

public Controller(@Qualifier("tablet")Gadgets gd) {
this.gd = gd;

*/
/*
public void setUser(@Qualifier("laptop")Gadgets gd) {
this.gd=gd;
}
*/
@GetMapping
public String display() {
return gd.display();
}}

