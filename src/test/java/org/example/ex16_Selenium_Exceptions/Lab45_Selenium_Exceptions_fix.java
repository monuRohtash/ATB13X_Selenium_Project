package org.example.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab45_Selenium_Exceptions_fix {



    @Test
    public void test_selenium_exceptions() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");


        try {
            driver.findElement(By.id("pramod"));
        } catch (NoSuchElementException  e) {
            System.out.println("Element not found!!");
        }
    }


}
