package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Selenium_004_WebdriverHierarchy {

        // Webdriver hierarchy

        // SearchContext(I) -> (2)
        // -> WebDriver(I)( 10) ->
        // RemoteWebDriver(C) (15)
        //        //
        // -> ChromiumDriver(C) 25 ->
        //          EdgeDriver(C) (45), ChromeDriver

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

//        SearchContext driver = new EdgeDriver();
//        SearchContext driver1 = new FirefoxDriver();
//        SearchContext driver2 = new InternetExplorerDriver();


//        WebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver1 = new ChromeDriver();
//        ChromeDriver  driver2 = new ChromeDriver();


        // Scenarios

        // 1. Do want to run on  Chrome or Edge? (1-2%)
        ChromeDriver driver = new ChromeDriver();


        // 2  Do you want to run on Chrome then change to Edge ? (96%)
        WebDriver driver1 = new ChromeDriver();
//        driver1 = new EdgeDriver();


        // 3. Do you want to run on multiple browsers, aws machine? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)


    }



