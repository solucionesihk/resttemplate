package com.javahonk;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class RESTFulServiceConsumer {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        
        String consumeJSONString = restTemplate.getForObject("http://localhost:8080/SampleRESTFulService/consumeJSONString", String.class);
        System.out.println("JSON String: "+consumeJSONString);
        
        List<String> listStrings = restTemplate.getForObject("http://localhost:8080/SampleRESTFulService/consumeJSONList", List.class);
        System.out.println("List of String: "+listStrings);
        
        HashMap<String, String> hashMap = restTemplate.getForObject("http://localhost:8080/SampleRESTFulService/consumeJSONMap",  HashMap.class);        
        System.out.println("JSON Map: "+hashMap);
        
        
        Pivotalsoftware objectExample = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Pivotalsoftware.class);
        System.out.println("Name:    " + objectExample.getName());
        System.out.println("About:   " + objectExample.getAbout());
        System.out.println("Phone:   " + objectExample.getPhone());
        System.out.println("Website: " + objectExample.getWebsite());
    }

}