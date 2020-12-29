package com.nextBaseCRM.test.Ramiz;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {


    public void highPriority(String userName) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();

        driver.findElement(By.id("feed-add-post-form-tab-tasks")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='bx-component-scope-lifefeed_task_form']/div/div[1]/div[1]/div[1]/label")).click();

        WebElement checkbox = driver.findElement(By.xpath("//*[@id='bx-component-scope-lifefeed_task_form']/div/div[1]/div[1]/div[1]/label"));
        String select= "";
        if(!checkbox.isSelected()){
            select = "";
        }else{
            select = " not";
        }

        System.out.println("User is"+select+" able to select The High Priority checkbox");

        driver.findElement(By.xpath("//*[@id='user-block']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='popup-window-content-menu-popup-user-menu']/div/div/a[3]/span[2]")).click();

Thread.sleep(3000);



        driver.close();

    }

}
