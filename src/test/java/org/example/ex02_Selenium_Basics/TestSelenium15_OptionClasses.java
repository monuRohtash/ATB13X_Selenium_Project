package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium15_OptionClasses {

    @Test
    public void Test_headless_() throws InterruptedException {

        ChromeOptions Options = new ChromeOptions();
//        Options.addArguments("--headless");
//        Options.addArguments("--window-size=800,600");
//        Options.addArguments("--start-maximized");
        Options.addArguments("--incognito");
//        Options.addArguments("--guest");

        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser

        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?


        WebDriver driver = new ChromeDriver(Options);
        driver.get("https://bing.com");
        System.out.println("Page title is : " + driver.getTitle());

        Thread.sleep(5000);


        driver.quit();

    }
}
