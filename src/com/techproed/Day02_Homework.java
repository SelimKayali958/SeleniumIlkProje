package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Homework {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mk201\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String faceTitle = driver.getTitle();

        if(faceTitle.toLowerCase().contains("facebook")){
            System.out.println("true");
        }else {
            System.out.println(faceTitle);
        }

        String faceUrl = driver.getCurrentUrl();

        if(faceUrl.toLowerCase().contains("facebook")){
            System.out.println("true");
        }else {
            System.out.println(faceUrl);
        }

        driver.navigate().to("https://walmart.com");

        String walTitle = driver.getTitle();

        if(walTitle.contains("Walmart.com")){
            System.out.println("true");;
        }else{
            System.out.println("false");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();


    }

}
