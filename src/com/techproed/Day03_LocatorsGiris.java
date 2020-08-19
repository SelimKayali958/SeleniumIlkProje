package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // ilk webelementi buluyoruz

        //webelemeti id kullanarak buluyoruz
        WebElement signInLink = driver.findElement(By.id("sign-in"));

        //webelementi tikliyoruz
        signInLink.click();

        //email kutusunu bulalim
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        // sifre kutusunu buluyoruz
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));

        //sifre kutusu icine sifre gonderiyoruz
        sifreKutusu.sendKeys("Test1234!");

        // sign in butonunu buluyoruz 
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String  baslik = driver.getTitle();
         if(baslik.equals("Address Book")){
             System.out.println("Giris basarili");
         }else{
             System.out.println("Giris basarisiz");
         }

    }
}
