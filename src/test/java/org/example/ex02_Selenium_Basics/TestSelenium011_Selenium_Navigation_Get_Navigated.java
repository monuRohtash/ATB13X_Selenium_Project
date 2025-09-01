package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium011_Selenium_Navigation_Get_Navigated {

    WebDriver driver;

    @Description("Open the URL")
    @Test
    public void Test_Selenium_Navigation() throws InterruptedException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://google.com"); // 95%


        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL

        //  navigate.to()
        // --------------------------
        // 🧭 Navigation methods
        // --------------------------

        // Go to Bing
        driver.navigate().to("https://bing.com");
        Thread.sleep(2000);
        System.out.println(" Go to Bing");

        // Back to
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Back to ");

        // Refresh page (reload video)
        driver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println("Refresh page");

        // Forward (back to Bing again)
        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println("Forward (back to Bing again)");


    }






    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

