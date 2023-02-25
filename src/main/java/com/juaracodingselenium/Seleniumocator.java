package com.juaracodingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Seleniumocator {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracooding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "https://demoqa.com/text-box";
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        String titleHeader = driver.getTitle();
        System.out.println("Title Header : " +titleHeader);

        //Locator
        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("Title Page : " +title);
        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        // Scrollby pixel (vertikal)
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("submit")).click();
        System.out.println("Data Berhasil disimpan");

        // verify
        System.out.println("Test Case Result : ");
        if ((title.equals("Text box"))){
            System.out.println("Passed");
        }else{
            System.out.println("Failed   ");
        }


            // checkbox
           driver.get("https://demoqa.com/checkbox");
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

//        driver.quit();
//        System.out.println("Browser quit");
//        //locator
//        String title = driver.findElement(By.className("main-header")).getText();
//        System.out.println("Title Page: " + title);
//        driver.findElement(By.id("username")).sendKeys( "JuaraCoding");
//        driver.findElement(By.id("UserEmail")).sendKeys("info@juaracoding.com");
//        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
//        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
     //   Scroll by pixel (Vertical)
      //  js.executeScript( "winndow.scrollBy(0,500)");
//        driver.findElement(By.id("submit")).click();
//        System.out.println("Data Berhasil Disimpan");
//
//        //Verify
 //       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
        // checkbox
//        driver.get("http://demoga.com/checkbox");
//        driver.findElements(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
//        driver.findElements(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]")).click();
     //   String txtDownlaoads = dri
//

    }
}