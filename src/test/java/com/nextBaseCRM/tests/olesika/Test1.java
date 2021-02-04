package com.nextBaseCRM.tests.olesika;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Why is so hard to create a project with any commits?");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Santa_Claus");
        // almost

        String gift = "good girl";
        String noGift = "Nope this year";


    }
}
