package com.example.tempwordsoap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.tempwordsoap.temparature.CelsiusToFahrenheitResponse;
import com.example.tempwordsoap.temparature.CelsiusToFahrenheit;

@Service
public class TemparatureConversionService {
	
	private final WebServiceTemplate temparatureWebServiceTemplate;
	
	@Autowired
	public TemparatureConversionService(WebServiceTemplate temparatureWebServiceTemplate)
	{
		this.temparatureWebServiceTemplate=temparatureWebServiceTemplate;
	}
		

	public String celsiusToFahrenhite(double celsius) 
	{
			// TODO Auto-generated method stub
		CelsiusToFahrenheit request=new CelsiusToFahrenheit();
		request.setCelsius(String.valueOf(celsius));
		
		CelsiusToFahrenheitResponse response= (CelsiusToFahrenheitResponse) temparatureWebServiceTemplate.
				marshalSendAndReceive("https://www.w3schools.com/xml/tempconvert.asmx",request,
				new SoapActionCallback("https://www.w3schools.com/xml/CelsiusToFahrenheit"));
		
		return response.getResult();
			 
	}


//	public String celsiusToFahrenhite(double celsius) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
