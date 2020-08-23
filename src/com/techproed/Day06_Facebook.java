package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        WebElement passwordKutusu = driver.findElement(By.id("pass"));
        passwordKutusu.sendKeys("Test1234");

        WebElement login = driver.findElement(By.id("u_0_b"));
        login.click();

        // burada java 3000 milisaniye bekleyecek
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        String url = driver.getCurrentUrl();
        System.out.println(url);
        if(url.contains("facebook.com/login/")){
            System.out.println("Giriş Başarısız !");
        }else{
            System.out.println("Giriş Başarılı !");
        }

        driver.quit();


    }


}
