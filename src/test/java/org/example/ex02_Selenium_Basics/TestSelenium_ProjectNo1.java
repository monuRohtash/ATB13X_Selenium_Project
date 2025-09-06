package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Link;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Objects;
import java.util.Objects;

public class TestSelenium_ProjectNo1 {

    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Link("https://bugz.atlassian.net/browse/VP-1")
    @Test
    public void test_verify_text_katalon(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getPageSource());


        if (Objects.requireNonNull(driver.getPageSource()).contains("CURA Healthcare Service")){
            System.out.println("Test cass pass!");
            Assert.assertTrue(true);
        }else{
            System.out.println("Test Case Failed!");
            Assert.fail();
        }


        driver.quit();



    }

}
