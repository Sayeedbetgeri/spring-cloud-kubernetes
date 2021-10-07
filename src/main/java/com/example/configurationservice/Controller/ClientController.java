package com.example.configurationservice.Controller;


import com.example.configurationservice.configuration.KubeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private KubeConfig config;

    @GetMapping
    public String load() {
        return String.format(config.getMessage(), "", "");
    }
}