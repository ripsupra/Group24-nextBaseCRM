package com.nextBaseCRM.tests.Adil.UserStoryOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStoryOneMethod {

    public String username, password;

    public void logIn(String username, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.nextbasecrm.com/stream/");

        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.name("USER_REMEMBER")).click();
        driver.findElement(By.className("login-btn")).click();
        int ascii = 0x2713;
        String sign = Character.toString((char) ascii);
        if (driver.getTitle().contains("Portal")) {
            System.out.println(username + " Log-In Successful" + "\n" + "\t username remembered(" + sign + ")");
        } else {
            System.out.println(username + " Please Try-Again");
        }

        driver.quit();
    }

    public void forgotPassword(String username) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.nextbasecrm.com/stream/");

        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.className("login-link-forgot-pass")).click();
        if (driver.getTitle().contains("Get Password")) {
            System.out.println(username + " - FORGOT YOUR PASSWORD link accessed successfully.");
        } else {
            System.out.println("Please check you code, FORGOT PASSWORD link was not able to be accessed");
        }
        driver.quit();


    }


}
