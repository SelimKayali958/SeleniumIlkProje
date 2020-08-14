package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {

        // java projemize chromedriver'i tanittik
        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");

        // selenium ile ilgili ilk kodumuz
        // webdriver nesnesi olusturarak chrome driveri kullanilabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();


        // driver'imiza google.com'a gitmesini soyledik
        webDriver.get("https://www.google.com");

        // driver'imizda acik olan pencereyi kapatir.
        // webDriver.close();

        // driver'imizi komple kapatiyor
        // webDriver.quit();




    }

}
