package org.example.ex02_Selenium_Basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Selenium_Commands {


//    public static void main(String[] args) {
    @Test
    public void test23() {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        // When you are done with the browser,
        // you want to close all the tabs and browser.
        driver.quit();

    }
    }


