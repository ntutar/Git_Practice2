package com.cybertek.tests.day0.vytrack_assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class vytrack_Nazmi {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() throws InterruptedException{
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("https://qa2.vytrack.com/");
        //login as a truck driver
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user165");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
        Thread.sleep(5000);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a/span")).click();
    }

    @Test
    public void resetGrid(){
        //Truck driver clicks to the Grid Setting icon
        driver.findElement(By.xpath("//i[@class='fa-cog hide-text']")).click();
       
       // String actualGridText = driver.findElement(By.xpath("//i[@class='fa-cog hide-text']")).getText();
        //String expectedGridText = "Grid Settings";

       // Assert.assertEquals(actualGridText,expectedGridText);

      //  driver.findElement(By.xpath("//input[@id='column-c149']"));
        //Truck driver clicks on reset icon
      //  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a/span")).click();

    }






}
//    WebElement Username_InputBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
//    WebElement Password_InputBox = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
//    WebElement LogIn_Button = driver.findElement(By.xpath("//button[@id='_submit']"));