package com.nextBaseCRM.test.Adil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInMethod {

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
        String sign = Character.toString((char)ascii);
        if (driver.getTitle().contains("Portal")) {
            System.out.println(username + " Log-In Successful"+"\n"+"\t username remembered("+sign+")");
        } else {
            System.out.println(username + " Please Try-Again");
        }
        // hello
        driver.quit();
    }

}
