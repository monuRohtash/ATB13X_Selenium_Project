package org.example.ex017_DataDrivenTestWith_OHRM;


import org.example.utils.UtilExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;

public class Lab_50_DDT_TestNG_OHRMOptimize_code {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Page Loaded: " + driver.getCurrentUrl() + " | " + driver.getTitle());
    }

    // Reusable login method
    public void login(String username, String password) {
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernameInput.clear();
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginBtn.click();
    }


    @Test(dataProvider = "getdata", priority = 1)
    public void testInvalidLogin(String username, String password) {
        login(username,password);

        // Verify errorMsg Invalid credentials
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
        Assert.assertTrue(errorMsg.getText().contains("Invalid credentials"));
        System.out.println("Error Message: " + errorMsg.getText());
    }

    @Test(dataProvider = "getdata", priority = 2)
    public void testValidLogin(String username, String password) {
        login(username, password);

        // Verify Dashboard is displayed
        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        Assert.assertTrue(dashboard.isDisplayed());
        System.out.println("Login successful! Page Title: " + driver.getTitle());
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider
    public Object[][] getdata() {
        return UtilExcel.getTestDataFromExcel("sheet1");
    }

}

