package com.nextBaseCRM.test.Ramiz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Selenium_HomeWork {
    public static void main(String[] args) {

        deleteButton();

       // T3();

    }

    public static void timeWait(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    public static void deleteButton() {
        //TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2. Go to http://practice.cybertekschool.com/add_remove_elements/
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        timeWait(2);
        // 3. Click to “Add Element” button
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Verification delete button Passed!!!");
        } else {
            System.out.println("Verification delete button Failed!!!");
        }
       // System.out.println(driver.findElement(By.xpath("//div[@id='elements']")).getText());

        // 5. Click to “Delete” button.
        deleteButton.click();
        timeWait(3);
        // 6. Verify “Delete” button is NOT displayed after clicking.
        if (!driver.findElement(By.xpath("//div[@id='elements']")).getText().contains("Delete")) {
            System.out.println("Verification delete button not displayed after click Passed!!!");
        } else {
            System.out.println("Verification delete button not displayed after click Failed!!!");
        }
        timeWait(3);
        driver.close();
        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


    }


    public static void T3() {


        //  TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2. Go to http://practice.cybertekschool.com/add_remove_elements/
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        timeWait(2);
        //  3. Click to “Add Element” button 50 times
        for (int i = 0; i < 50; i++) {
            driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        }

        //  4. Verify 50 “Delete” button is displayed after clicking.
      List<WebElement> allDelete = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));

        int deleteButtonSize = 0;

        for(WebElement eachDeleteButton : allDelete){
            if(eachDeleteButton.isDisplayed()){
                deleteButtonSize++;
            }
        }
        System.out.println("Total Delete button size is: "+deleteButtonSize);

        //  5. Click to ALL “Delete” buttons to delete them.
        for(int i =0; i<50; i++){
            driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
            timeWait(1);
        }
        //  6. Verify “Delete” button is NOT displayed after clicking.
        if (!driver.findElement(By.xpath("//div[@id='elements']")).getText().contains("Delete")) {
            System.out.println("Verification delete button not displayed after clicked all delete button Passed!!!");
        } else {
            System.out.println("Verification delete button not displayed after clicked all delete button Failed!!!");
        }

        //  USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //  Hint: Need to use findElements method


    }



}
