package com.example.tempwordsoap.temparature;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder = {
        "result"
})
public class CelsiusToFahrenheitResponse {
    @XmlElement(name = "result")
    protected String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
