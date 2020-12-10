package com.cybertek.tests.day0;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class vytrack2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        // log in as truck driver
        driver.findElement(By.id("prependedInput")).sendKeys("user165");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(2000);

        Select fleetDropdown = new Select(driver.findElement(By.xpath("//span[@class='title title-level-1']")));




/*
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        //driver.findElement(By.linkText("Vehicles")).click();
        driver.findElement(By.linkText("Vehicle Odometer")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Create Vehicle Odometer")).click();
        Thread.sleep(4000);

 */




    }
}

