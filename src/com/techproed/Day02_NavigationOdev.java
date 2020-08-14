package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {

    public static void main(String[] args) {

        // 1 - ilk önce google.com'a gidiniz.
        // 2 - oradan youtube.com'a gidiniz.
        // 3 - google.com'a back methodu ile geri dönünüz.
        // 4 - youtube.com'a geri giniz.(forward methodu ile)
        // 5 - youtube.com'u yenileyiniz (refresh methodu ile)


        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://google.com");

        webDriver.get("https://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();



    }

}
