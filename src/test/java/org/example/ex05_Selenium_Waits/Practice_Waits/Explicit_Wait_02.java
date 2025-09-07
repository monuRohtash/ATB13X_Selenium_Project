package org.example.ex05_Selenium_Waits.Practice_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Explicit_Wait_02 {


    WebDriver driver = new ChromeDriver();
    @Description(" Verify tha Explicit_Wait with testng")
    @Test
    public void Explicit_Wait_02() {

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // जब तक username box visible न हो जाए तब तक wait करेगा
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");


        // जब तक password box visible न हो जाए तब तक wait करेगा
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");


        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();


    }

    @Test
    public void TearDown(){

        driver.quit();
    }



}
