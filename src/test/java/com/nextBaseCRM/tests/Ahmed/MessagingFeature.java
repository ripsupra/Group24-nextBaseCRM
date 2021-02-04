package com.nextBaseCRM.tests.Ahmed;

import com.nextBaseCRM.test.utilities.WebDriverFactory;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class MessagingFeature {
    public String userName, message, link;
    public static final String passWord = "UserUser";

    public static void sendMessage(WebDriver driver, String userName, String message) throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://qa.nextbasecrm.com/stream/?login=yes");
        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys(passWord);

        driver.findElement(By.xpath("//*[@id='login-popup']/form/div[2]/input")).click();

        driver.findElement(By.xpath("//*[@id='feed-add-post-form-tab-message']/span")).click();
        Thread.sleep(2000);
        WebElement frame = driver.findElement(By.xpath("//*[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe"));
        /*switching to the frame where we have the text editor can also be done by using the index number of the frame it works like an array
         the index number starts from 0. exp: driver.switchTo().frame(index number)*/
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("/html/body")).sendKeys(message);
        Thread.sleep(2000);
        driver.switchTo().parentFrame();

        driver.findElement(By.id("blog-submit-button-save")).click();
        Thread.sleep(2000);
        driver.close();


    }

    public static void cancelMessage(WebDriver driver, String userName, String message) throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://qa.nextbasecrm.com/stream/?login=yes");
        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys(passWord);

        driver.findElement(By.xpath("//*[@id='login-popup']/form/div[2]/input")).click();

        driver.findElement(By.xpath("//*[@id='feed-add-post-form-tab-message']/span")).click();
        Thread.sleep(2000);
        WebElement frame = driver.findElement(By.xpath("//*[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe"));
        /*switching to the frame where we have the text editor can also be done by using the index number of the frame it works like an array
         the index number starts from 0. exp: driver.switchTo().frame(index number)*/
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("/html/body")).sendKeys(message);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.chord(Keys.DELETE));
        driver.switchTo().parentFrame();

        driver.findElement(By.id("blog-submit-button-cancel")).click();
        driver.close();
    }

    public static void attachLink(WebDriver driver, String userName, String link, String linkText) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://qa.nextbasecrm.com/stream/?login=yes");
        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);
        Thread.sleep(2000);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(passWord);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='login-popup']/form/div[2]/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='feed-add-post-form-tab-message']/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("bx-b-link-blogPostForm")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("linkidPostFormLHE_blogPostForm-text")).sendKeys(linkText);
        Thread.sleep(2000);
        driver.findElement(By.id("linkidPostFormLHE_blogPostForm-href")).sendKeys(link);
        Thread.sleep(2000);
        driver.findElement(By.className("adm-btn-save")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("blog-submit-button-save")).click();
        Thread.sleep(4000);

        driver.close();
    }


}
/*

helpdesk47@cybertekschool.com
helpdesk48@cybertekschool.com

marketing47@cybertekschool.com
marketing48@cybertekschool.com


hr47@cybertekschool.com
hr48@cybertekschool.com
not complete
 */