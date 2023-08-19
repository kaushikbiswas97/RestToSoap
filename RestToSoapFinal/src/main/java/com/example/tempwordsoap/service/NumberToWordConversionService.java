package com.example.tempwordsoap.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.tempwordsoap.number.NumberToWords;
import com.example.tempwordsoap.number.NumberToWordsResponse;

@Service
public class NumberToWordConversionService {
	
	private final WebServiceTemplate numTowordWebServiceTemplate;
	
	@Autowired
	public NumberToWordConversionService(WebServiceTemplate numTowordWebServiceTemplate)
	{
		this.numTowordWebServiceTemplate=numTowordWebServiceTemplate;
	}
		
	public String numberToWords(int num)
		{
			NumberToWords request=new NumberToWords();
			request.setUbiNum(BigInteger.valueOf(num));
			
			NumberToWordsResponse response= (NumberToWordsResponse) numTowordWebServiceTemplate.
					marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/numberconversion.wso",request,
					new SoapActionCallback("https://www.dataaccess.com/webservicesserver/numberconversion.wso/NumberToWords"));
			
			return response.getWordResult();
		}
	
}