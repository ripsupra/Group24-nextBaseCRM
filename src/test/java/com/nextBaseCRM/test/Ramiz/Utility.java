package com.nextBaseCRM.test.Ramiz;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Utility {

    public void timeWait(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){


        }
    }

    public void highPriority(String userName) {


       WebDriverManager.chromedriver().setup();

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

        driver.get("https://qa.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();



       driver.findElement(By.id("feed-add-post-form-tab-tasks")).click();
        timeWait(3);
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
        timeWait(2);
        driver.findElement(By.xpath("//*[@id='popup-window-content-menu-popup-user-menu']/div/div/a[3]/span[2]")).click();

timeWait(2);



        driver.close();

    }


    public void checkList(String userName, String sentence) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();


        driver.findElement(By.id("feed-add-post-form-tab-tasks")).click();
      timeWait(4);

        driver.findElement(By.xpath("//span[@class='tasks-task-mpf-link']")).click();
       timeWait(1);
      driver.findElement(By.xpath("//*[@id='bx-component-scope-lifefeed_task_form-checklist']/div[3]/span/span/input")).click();
        driver.findElement(By.xpath("//*[@id='bx-component-scope-lifefeed_task_form-checklist']/div[3]/span/span/input")).sendKeys(sentence);



        driver.findElement(By.xpath("//*[@id='bx-component-scope-lifefeed_task_form-checklist']/div[3]/div/span[1]/span")).click();
        timeWait(1);
        String checklistTest = driver.findElement(By.className("js-id-checklist-is-i-title")).getText();
        System.out.println(checklistTest);
        if(checklistTest.contains(sentence)){
            System.out.println("Passed!!!");
        }else{
            System.out.println("Failed");
        }
        timeWait(1);


driver.close();

    }


    public void datePicker(String userName) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys(userName);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();



        driver.findElement(By.id("feed-add-post-form-tab-tasks")).click();
        timeWait(1);

        driver.findElement(By.xpath("//*[@id='bx-component-scope-lifefeed_task_form']/div/div[3]/div[2]/div/div[1]/span[1]/span/input[1]")).click();
       timeWait(1);
        driver.findElement(By.xpath("//a[@data-date='1609718400000']")).click();
        driver.findElement(By.xpath("//span[.='Select']")).click();
       timeWait(2);
        driver.close();
    }

}
