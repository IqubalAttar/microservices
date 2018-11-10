package com.iq.microservices.limitsservice.Controller;

import com.iq.microservices.limitsservice.bean.LimitsConfiguration;
import com.iq.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations(){

        return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
