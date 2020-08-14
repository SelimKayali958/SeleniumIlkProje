package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();

        if(youtubeTitle.toLowerCase().contains("video")){
            System.out.println("video kelimesini iceriyor");
        }else{
            System.out.println("video kelimesini icermiyor");
        }

        driver.quit();

    }

}
