package com.juaracodingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracooding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "https://demoqa.com/frames";
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("Title Page : " + title);

        WebElement frameSamplePage = driver.findElement(By.id("frame"));
        driver.switchTo().frame(frameSamplePage);

        js.executeScript( "windows.scrollBy(0,500)");


        String txtFrame = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(txtFrame);

        //keluar dari frame
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath( "//*[@id = ''frameWrapper']/div"));

    }


    }
