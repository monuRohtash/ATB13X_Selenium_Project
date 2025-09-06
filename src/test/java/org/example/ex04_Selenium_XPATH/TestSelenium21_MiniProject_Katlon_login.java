package org.example.ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_Katlon_login extends CommonToAll {


    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_katalon_login() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement Make_Appoiment_btn_xpath = driver.findElement(By.id("btn-make-appointment"));
        Make_Appoiment_btn_xpath.click();

        List<WebElement> username_input_box_xpath_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_xpath_placeholder.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");


        WebElement login_btn = driver.findElement(By.id("btn-login"));
        login_btn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        //Verify Make Appointment TExt

        WebElement h2 = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(h2.getText(),"Make Appointment");
        Assert.assertTrue(h2.isDisplayed());



        closeBrowser(driver);




    }


}
