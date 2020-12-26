package com.nextBaseCRM.test.Ahmed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.io.File;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        MessagingFeature.sendMessage("helpdesk48@cybertekschool.com", "selenium Test");
        MessagingFeature.cancelMessage("marketing47@cybertekschool.com", "Testing cancel");
        MessagingFeature.attachLink("hr47@cybertekschool.com", "https://www.HelloWorld.com", "just a simple Link");



    }
}

/*
helpdesk47@cybertekschool.com
helpdesk48@cybertekschool.com
---
marketing47@cybertekschool.com
marketing48@cybertekschool.com
---
hr47@cybertekschool.com
hr48@cybertekschool.com
 */