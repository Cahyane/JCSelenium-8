package com.juaracodingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumCheckbox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracooding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = ("https://demoqa.com/checkbox");
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");
        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button")).click();
        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[3]")).click();
        String txtDownload = driver.findElement(By.xpath("//*[@id='result']/span[2]")).getText();
        System.out.println(txtDownload);

        System.out.println("Delay 3 Seconds");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e); }
        driver.quit();
        System.out.println("Quit Browser");
    }
}
