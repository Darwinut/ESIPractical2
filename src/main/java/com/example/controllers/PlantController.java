package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantController {
	
	@RequestMapping
	public String HelloWorld(){
		return "/home";
	}
}
