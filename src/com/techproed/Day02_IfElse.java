package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        String amazonTitle = driver.getTitle();

        // contains() metodu bir kelimenin bir yazi icersinde gecip
        // gecmedigini kontrol eder

        if(amazonTitle.toLowerCase().contains("car")){
            System.out.println("car kelimesi geciyor : "+amazonTitle);
        }else{
            System.out.println("car kelimesi gecmiyor : "+amazonTitle);
        }

        driver.quit();


    }
}
