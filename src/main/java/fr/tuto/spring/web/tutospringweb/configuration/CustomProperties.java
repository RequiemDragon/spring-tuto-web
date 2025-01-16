package fr.tuto.spring.web.tutospringweb.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties(prefix = "fr.tuto.spring.web.tutospringweb")
@Data
public class CustomProperties {

    private String apiUrl;

}
