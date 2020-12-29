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
    private static String loginHr1, loginHr2, loginHelpDesk1, loginHelpDesk2, loginMark1, loginMark2;

    static {
        loginHelpDesk1 = "helpdesk47@cybertekschool.com";
        loginHelpDesk2 = "helpdesk48@cybertekschool.com";
        loginMark1 = "marketing47@cybertekschool.com";
        loginMark2 = "marketing47@cybertekschool.com";
        loginHr1 = "hr47@cybertekschool.com";
        loginHr2 = "hr48@cybertekschool.com";
    }


    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> usersLogin = new ArrayList<String>(Arrays.asList("helpdesk47@cybertekschool.com","helpdesk48@cybertekschool.com","marketing47@cybertekschool.com",
                "marketing47@cybertekschool.com","hr47@cybertekschool.com","hr48@cybertekschool.com"));
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the browser you want to use: ");
        String browser = input.next();
        //String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);
        // Loop to send message using all the credentials
        /*for (String eachUser: usersLogin){
            MessagingFeature.sendMessage(driver, eachUser, "selenium Test "+eachUser.substring(0, eachUser.indexOf('@')) +" using "+browser);
        }*/
        // Loop to test cancel message using all the credentials
        for (String eachUser: usersLogin){
            MessagingFeature.cancelMessage(driver, eachUser, "Testing cancel "+eachUser.substring(0, eachUser.indexOf('@')) +" using "+browser);
        }
        // Loop to attach a link and send it using all the credentials
       /* for (String eachUser: usersLogin){
            MessagingFeature.attachLink(driver, eachUser, "https://cat-bounce.com/", "just a simple Link "+eachUser.substring(0, eachUser.indexOf('@')) +" using "+browser);
        }*/
        /*
        //Test Case #1 Sending a message with all users
        MessagingFeature.sendMessage(driver, loginHr1, "selenium Test HR-47 using "+browser);
        MessagingFeature.sendMessage(driver, loginHr2, "selenium Test HR-48 using "+browser);
        MessagingFeature.sendMessage(driver, loginHelpDesk1, "selenium Test Helpdesk 47 using "+browser);
        MessagingFeature.sendMessage(driver, loginHelpDesk2, "selenium Test Helpdesk 48 using "+browser);
        MessagingFeature.sendMessage(driver, loginMark1, "selenium Test Marketing 47 using "+browser);
        MessagingFeature.sendMessage(driver, loginMark2, "selenium Test Marketing 48 using "+browser);
        //Test Case #2 Cancel message with all users
        MessagingFeature.cancelMessage(driver, loginHr1, "Testing cancel HR-47 ");
        MessagingFeature.cancelMessage(driver, loginHr2, "Testing cancel HR-48 using ");
        MessagingFeature.cancelMessage(driver, loginHelpDesk1, "Testing cancel Helpdesk 47");
        MessagingFeature.cancelMessage(driver, loginHelpDesk2, "Testing cancel Helpdesk 48");
        MessagingFeature.cancelMessage(driver, loginMark1, "Testing cancel Marketing 47");
        MessagingFeature.cancelMessage(driver, loginMark2, "Testing cancel Marketing 48");
        //Test Case #3 Attach a link for all users of group24
        MessagingFeature.attachLink(driver, loginHr1, "https://cat-bounce.com/", "just a simple Link HR-47 you must check it out!!!!! using "+browser);
        MessagingFeature.attachLink(driver, loginHr2, "https://cat-bounce.com/", "just a simple Link HR-48 you must check it out!!!!! using "+browser);
        MessagingFeature.attachLink(driver, loginHelpDesk1, "https://cat-bounce.com/", "just a simple Link Helpdesk 47 you must check it out!!!!! using "+browser);
        MessagingFeature.attachLink(driver, loginHelpDesk2, "https://cat-bounce.com/", "just a simple Link Helpdesk 48 you must check it out!!!!! using "+browser);
        MessagingFeature.attachLink(driver, loginMark1, "https://cat-bounce.com/", "just a simple Link Marketing 47 you must check it out!!!!! using "+browser);
        MessagingFeature.attachLink(driver, loginMark2, "https://cat-bounce.com/", "just a simple Link Marketing 48 you must check it out!!!!! using "+browser);
*/
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