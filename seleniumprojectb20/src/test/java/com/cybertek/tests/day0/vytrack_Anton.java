package com.cybertek.tests.day0;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vytrack_Anton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user165");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[5]/a/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("custom_entity_type_TotalPrice-uid-5f596523b47e5")).click();
        Thread.sleep(5000);




    }
}
