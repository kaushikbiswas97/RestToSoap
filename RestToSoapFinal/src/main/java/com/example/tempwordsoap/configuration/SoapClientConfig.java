package com.example.tempwordsoap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;



@Configuration

public class SoapClientConfig{
	@Bean
	public WebServiceTemplate webserviceTemplate(Jaxb2Marshaller marshaller)
	{
		WebServiceTemplate webserviceTemplate = new WebServiceTemplate();
		
		webserviceTemplate.setMarshaller(marshaller);
		webserviceTemplate.setUnmarshaller(marshaller);
		
		return webserviceTemplate;
		
	}
	@Bean
	public Jaxb2Marshaller marshaller()
	{
		Jaxb2Marshaller marshaller=new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.example.tempwordsoap.number","com.example.tempwordsoap.temparature");
		return marshaller;
	}
}
