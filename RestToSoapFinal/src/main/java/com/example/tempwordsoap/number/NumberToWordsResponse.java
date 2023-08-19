package com.example.tempwordsoap.number;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "wordResult"
})

public class NumberToWordsResponse {
	 @XmlElement(name = "wordResult")
	    protected String wordResult;

	    public String getWordResult() {
	        return wordResult;
	    }

	    public void setWordResult(String wordResult) {
	        this.wordResult = wordResult;
	    }
}
