package com.example.ScrapingApp.configuration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SeleniumConfig {
    @PostConstruct
    void postConstructor() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Donatas/Desktop/chromedriver.exe");
    }

    @Bean
    public ChromeDriver driver() {
        return new ChromeDriver();
    }
}
