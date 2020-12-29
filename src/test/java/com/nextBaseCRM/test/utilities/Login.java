package com.nextBaseCRM.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

public class Login {
    public String userName;
    public static final String passWord = "UserUser";
    public static void login(String userName){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the browser you want to use: ");
        String browser = input.next();
        WebDriver driver = WebDriverFactory.getDriver(browser);
        driver.get("https://qa.nextbasecrm.com/stream/?login=yes");
        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys(passWord);

        driver.findElement(By.xpath("//*[@id='login-popup']/form/div[2]/input")).click();
    }
}
