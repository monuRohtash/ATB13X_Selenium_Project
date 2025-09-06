package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_Selenium_003 {


    @Description("browser test report allure ")
    @Test
    public void Browser_Test(){
        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();
        // Open Google
        driver.get("https://www.google.com");
        // Print page title
        System.out.println("Title is: " + driver.getTitle());

    }

    @Test
    public void Browser_Test4() {
        // Start Firefox browser
        WebDriver driver = new ChromeDriver();
        // Open Google
        driver.get("https://www.google.com");
        // Print page title
        System.out.println("Title is: " + driver.getTitle());

    }



    @Test
    public void test_01() {
        WebDriver driver = new ChromeDriver();
//        driver = new FirefoxDriver();
//        driver = new EdgeDriver();
        driver.get("https://automationstepbystep.com/");

        System.out.println("Title" + driver.getTitle());
    }


    @AfterTest
    public void TearDown(){
        WebDriver driver = new ChromeDriver();
        driver.quit();

    }




}
