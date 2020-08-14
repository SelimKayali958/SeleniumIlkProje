package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {

        // driver'ımızı ekranı kaplayacak şekilde kullanalım.
        // 1 - ilk önce google.com'a gidelim.
        // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
        // 3 - daha sonra youtube.com'a gidelim.
        // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        // 6 - driver'ımızı kapatalım.

        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        String sayfaTitle1 = webDriver.getTitle();
        System.out.println(sayfaTitle1);
        webDriver.get("http://youtube.com");
        String sayfaTitle2 = webDriver.getTitle();
        String sayfaUrl1 = webDriver.getCurrentUrl();
        System.out.println(sayfaTitle2);
        System.out.println(sayfaUrl1);
        webDriver.navigate().back();
        String sayfaUrl2 = webDriver.getCurrentUrl();
        System.out.println(sayfaUrl2);
        webDriver.quit();
    }
}
