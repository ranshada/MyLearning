package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World !!!!");

        System.setProperty("webdriver.chrome.driver","/Users/ranjithkumarshada/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://time.ibm.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        sleep(5000);
        driver.findElement(By.id("credsDiv")).click();
        sleep(3000);
        driver.findElement(By.id("user-name-input")).sendKeys("Ranjith.k.shada@ibm.com");
        driver.findElement(By.id("password-input")).sendKeys("RanrachuSrkranju1$1");
        driver.findElement(By.id("login-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        //sleep(20000);
        //driver.quit();
    }
}
