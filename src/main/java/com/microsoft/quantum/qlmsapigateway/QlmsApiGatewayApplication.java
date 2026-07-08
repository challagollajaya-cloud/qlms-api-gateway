package com.microsoft.quantum.qlmsapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QlmsApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(QlmsApiGatewayApplication.class, args);
    }
}
