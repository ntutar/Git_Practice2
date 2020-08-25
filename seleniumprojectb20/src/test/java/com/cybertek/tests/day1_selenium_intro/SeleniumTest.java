package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException{

        //1- set up the web driver
        WebDriverManager.chromedriver().setup();

        //2- create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        //3- test if the driver is working
        driver.get("https://www.google.com");

        System.out.println("The title of the page is: "+driver.getTitle());
        //==>The title of the page is: Google

        String actualTitle = driver.getTitle();
        System.out.println("Actual title string is: "+actualTitle);
        //==> Actual title string is: Google

        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual URL: "+actualUrl);
        //==> Actual URL: https://www.google.com/


        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.navigate().to("https:/www.facebook.com");

        Thread.sleep(3000);
        driver.navigate().to("https:/www.youtube.com");

        String pageSource = driver.getPageSource();
        // System.out.println("pageSource = " + pageSource);

        driver.close();



    }

}
