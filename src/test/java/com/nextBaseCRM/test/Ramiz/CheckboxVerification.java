package com.nextBaseCRM.test.Ramiz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxVerification {

    public static void main(String[] args) throws InterruptedException {


    //TC	#2:	SeleniumEasy	CheckboxVerification–Section 1
   // 1.Open	Chrome	browser
WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

    //2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

   // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOT displayed



        if(driver.findElement(By.xpath("//div[contains(@style, 'none')]")).isEnabled()){
            System.out.println("Verification \"Success – Check box is checked\" message is NOT displayed is PASSED!!!");
        }else{
            System.out.println("Verification FAILED!!!");
        }

    //4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();

   // 5.Verify	“Success	–Check	box	is	checked”	message	is displayed.

        WebElement messageDisplay = driver.findElement(By.xpath("//div[@id='txtAge']"));

       if( messageDisplay.getText().equals("Success - Check box is checked") ){
           System.out.println("Verification Message PASSED!!!");
       }else {
           System.out.println("Verification Message FAILED!!!");
       }
       driver.close();
    }
}
