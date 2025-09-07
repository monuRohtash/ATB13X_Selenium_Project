package org.example.ex05_Selenium_Waits.Practice_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Implicit_Wait_01 {


    WebDriver driver = new ChromeDriver();
    @Description(" Verify tha Implicit_Wait with testng")
    @Test
    public void Implicit_Wait() {
//        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit Wait (10 सेकंड तक हर element के लिए wait करेगा)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Username box खोजेगा और text भरेगा
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // Password box खोजेगा
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // Login button क्लिक करेगा
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();


    }
  @Test
    public void TearDown(){
        driver.quit();

    }


}




