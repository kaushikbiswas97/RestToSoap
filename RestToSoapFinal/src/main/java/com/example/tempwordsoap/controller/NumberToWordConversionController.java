package com.example.tempwordsoap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.tempwordsoap.service.NumberToWordConversionService;

@RestController

public class NumberToWordConversionController {
	@Autowired
	private NumberToWordConversionService numbertowordconversionservice;
	
	@GetMapping("/convert/number-to-words")
	
	public String numberToWords(@RequestParam("number") int number)
	{
		String words = numbertowordconversionservice.numberToWords(number);
		return "The given " +number+"is"+words;
	}
}
