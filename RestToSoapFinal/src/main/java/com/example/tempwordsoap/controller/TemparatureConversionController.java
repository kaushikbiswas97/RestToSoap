package com.example.tempwordsoap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tempwordsoap.service.TemparatureConversionService;

@RestController
public class TemparatureConversionController {
	
	@Autowired
	private TemparatureConversionService temparatureconversionservice;
	
	@GetMapping("/convert/celsius-to-fahrenheit")
	public String celsiusToFahrenhite(@RequestParam("celsius") double celsius)
	{
		double fah = Double.parseDouble(temparatureconversionservice.celsiusToFahrenhite(celsius));
		return "The given " + celsius +"is equal to "+fah;
	}
}
