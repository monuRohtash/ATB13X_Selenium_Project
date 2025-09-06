package org.example.ex04_Selenium_XPATH;

import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_OHRM_Project_20 extends CommonToAll {


    @Test
    public void Test_OHRM_Test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        openBrowser(driver,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // ✅ Explicit Wait (10 sec max)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            // Wait until username field is visible
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("Admin");

            // Wait until username field is visible
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("admin123");


            WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
            btn.click();

            System.out.println("Login Test Completed!");


            // 7. Optional: Pause briefly for demo purposes
            Thread.sleep(3000);

            // 8. Print the resulting page title for verification
            System.out.println("Page Title after login: " + driver.getTitle());


            driver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//
//        WebElement h6 = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
//
//        Assert.assertEquals(h6.getText(),"Dashboard");




            System.out.println("Test is successfull!");


            closeBrowser(driver);



    }


}
