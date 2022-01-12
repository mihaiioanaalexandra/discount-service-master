package com.awbd.discountservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("discount-service")
@Getter
@Setter
public class PropertiesConfig {

    private Integer discount;

}
