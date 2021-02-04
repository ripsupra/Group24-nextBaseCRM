package com.nextBaseCRM.tests.Adil.UserStoryTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStoryTwoMethod {
    public String username, password, message;

    public void sendMessage(String username, String password, String message) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.nextbasecrm.com/stream/");

        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.name("USER_REMEMBER")).click();
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("microoPostFormLHE_blogPostForm_inner")).click();
        Thread.sleep(2000);

        driver.quit();
    }

    public void cancelMessage(String username, String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.nextbasecrm.com/stream/");

        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.name("USER_REMEMBER")).click();
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("microoPostFormLHE_blogPostForm_inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("blog-submit-button-cancel")).click();

        driver.quit();

    }

    public void attachLink(String username, String password, String text, String link) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.nextbasecrm.com/stream/");

        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.name("USER_REMEMBER")).click();
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("microoPostFormLHE_blogPostForm_inner")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("bx-b-link-blogPostForm")).click();
        driver.findElement(By.id("linkidPostFormLHE_blogPostForm-text")).sendKeys(text);
        driver.findElement(By.id("linkidPostFormLHE_blogPostForm-href")).sendKeys(link);
        driver.findElement(By.className("adm-btn-save")).click();

        driver.quit();
    }

}
