package com.juaracodingselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\juaracooding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String url = "https://demoqa.com/alerts";
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("Title Page : " + title);
        driver.findElement(By.id("alertButton")).click(); // alert button 1
        driver.switchTo().alert().accept();
        System.out.println("Alert Ok Clicked");

        driver.findElement(By.id("timerAlertButton")).click(); // alert button 2
        System.out.println("Delay 5 Seconds");
         try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e); }
        driver.switchTo().alert().accept();
        System.out.println("TimerAlertButton Ok Clicked");

        driver.findElement(By.id("confirmButton")).click(); // alert button 3
        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
        System.out.println("Alert Confirm Button Clicked");

        driver.findElement(By.id("promtButton")).click(); // alert button 4
        driver.switchTo().alert().sendKeys(" Widya");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
        System.out.println("Alert Promt Button Clicked");

    }
}