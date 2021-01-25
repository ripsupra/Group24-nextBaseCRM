package com.nextBaseCRM.test.Adil.UserStoryThree;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStoryThreeMethod {
    public void infoSearch(String username, String password, String itemToSearch) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.nextbasecrm.com/stream/");

        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.name("USER_REMEMBER")).click();
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.className("header-search-input")).sendKeys(itemToSearch);

        driver.quit();
    }
}
