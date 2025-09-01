package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium012_NOHTTPP {


    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        //        driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.
        driver.quit();
    }
}
