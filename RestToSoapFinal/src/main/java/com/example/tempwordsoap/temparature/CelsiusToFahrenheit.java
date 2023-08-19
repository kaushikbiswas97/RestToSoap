package com.example.tempwordsoap.temparature;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder= {
		"celsius"
})
@XmlRootElement(name="CelsiusToFahrenheit")

public class CelsiusToFahrenheit {
	@XmlElement(name = "celsius")
	protected String celsius;
	
	public String getCelsius()
	{
		return celsius;
	}
	public void setCelsius(String valueOf) {
		this.celsius=valueOf;
		// TODO Auto-generated method stub
		
	}
}
