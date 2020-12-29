package com.nextBaseCRM.test.Ahmed;

import com.nextBaseCRM.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Testing {

    static {
        String loginHelpDesk1 = "helpdesk47@cybertekschool.com";
        String loginHelpDesk2 = "helpdesk48@cybertekschool.com";
        String loginMark1 = "marketing47@cybertekschool.com";
        String loginMark2 = "marketing47@cybertekschool.com";
        String loginHr1 = "hr47@cybertekschool.com";
        String loginHr2 = "hr48@cybertekschool.com";
    }


    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> usersLogin = new ArrayList<String>(Arrays.asList("helpdesk47@cybertekschool.com", "helpdesk48@cybertekschool.com", "marketing47@cybertekschool.com",
                "marketing47@cybertekschool.com", "hr47@cybertekschool.com", "hr48@cybertekschool.com"));
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the browser you want to use: ");
        String browser = input.next();

        // Loop to send message using all the credentials
        for (String eachUser : usersLogin) {
            WebDriver driver = WebDriverFactory.getDriver(browser);
            MessagingFeature.sendMessage(driver, eachUser, "selenium Test " + eachUser.substring(0, eachUser.indexOf('@')) + " using " + browser);
        }
        // Loop to test cancel message using all the credentials
        for (String eachUser : usersLogin) {
            WebDriver driver = WebDriverFactory.getDriver(browser);
            MessagingFeature.cancelMessage(driver, eachUser, "Testing cancel " + eachUser.substring(0, eachUser.indexOf('@')) + " using " + browser);
        }
        // Loop to attach a link and send it using all the credentials
         for (String eachUser : usersLogin) {
            WebDriver driver = WebDriverFactory.getDriver(browser);
            MessagingFeature.attachLink(driver, eachUser, "https://cat-bounce.com/", "just a simple Link " + eachUser.substring(0, eachUser.indexOf('@')) + " using " + browser);
        }

// just using the terminal for git

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