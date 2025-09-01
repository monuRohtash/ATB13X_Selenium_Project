package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestSelenium09_Selenium_Assertion_TestNg {

    @Description("Verify that the title is visible")
    @Test
    public void teat_Selenium_assertion() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");


        //TestNg Assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isEqualTo ("https://www.google.com/");

        //AssertJ
        assertThat(driver.getCurrentUrl()).contains("google");


        driver.quit();


    }
}
