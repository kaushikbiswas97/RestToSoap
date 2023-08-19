package com.example.tempwordsoap.number;

import java.math.BigInteger;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder= {
		"ubiNum"
})
@XmlRootElement(name="NumberToWords")

public class NumberToWords {
	@XmlElement(required=true)
	@XmlSchemaType(name="unsignedLong")
	protected BigInteger ubiNum;
	
	public BigInteger getUbiNum()
	{
		return ubiNum;
	}
	public void setUbiNum(BigInteger val) {
		this.ubiNum=val;
		// TODO Auto-generated method stub
		
	}
}
