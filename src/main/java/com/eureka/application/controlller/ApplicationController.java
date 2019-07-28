package com.eureka.application.controlller;

import com.eureka.application.endpoints.ServiceEndPoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("application")
public class ApplicationController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("user-account/{accountNumber}")
    public String getUserAccountDetail(@PathVariable int accountNumber){
        return restTemplate.getForObject(ServiceEndPoints.ACCOUNTS_SERVICE+"/acc/account/account-detail/"+accountNumber, String.class);
    }

}
