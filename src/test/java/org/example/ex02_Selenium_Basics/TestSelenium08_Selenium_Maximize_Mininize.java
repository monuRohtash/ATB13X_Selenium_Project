package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Selenium_Maximize_Mininize {

    public static void main(String []args){

            WebDriver driver = new FirefoxDriver();
            driver.get("https://google.com");

//            driver.manage().window().maximize();
            driver.manage().window().minimize();

            driver.quit();




        }


}
