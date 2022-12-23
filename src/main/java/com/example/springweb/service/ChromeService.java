package com.example.springweb.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeService {
    public void runChrome(){
        System.setProperty("webdriver.chrome.driver",
                "E:\\SeleniumWebdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shopee.vn/");
    }
}
