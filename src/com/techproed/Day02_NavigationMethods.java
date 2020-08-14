package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/mk201/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        // driverin tum ekrani kaplamasini saglayir
        webDriver.manage().window().maximize();

        webDriver.get("https://google.com");

        // get komutu ile ayni islemi goruyor
        webDriver.navigate().to("http://amazon.com");

        // navigate().back() komutu ile bir onceki sayfaya donmeye yariyor
        webDriver.navigate().back();

        // navigate().forward() metodu geri geldigimiz saydaya gitmeye
        // yariyor. google ==> amazon , amazon ==> google , google ==> amazon
        webDriver.navigate().forward();


        // navigate().refresh() metodu sayfayi yenilemeyi yariyor
        webDriver.navigate().refresh();





    }


}
