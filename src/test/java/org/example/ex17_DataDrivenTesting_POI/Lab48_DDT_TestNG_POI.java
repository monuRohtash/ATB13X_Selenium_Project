package org.example.ex17_DataDrivenTesting_POI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;


public class Lab48_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public void test_vow(String Username, String Password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // ✅ Correct locator for username input
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        username.sendKeys(Username);

        // ✅ Correct locator for password input
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        password.sendKeys(Password);

        // ✅ Login button
        WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        btn.click();

        // ✅ Wait until dashboard or error notification
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")),
                ExpectedConditions.visibilityOfElementLocated(By.className("oxd-alert-content-text"))
        ));



        Thread.sleep(5000);

        driver.quit(); // ✅ Always close driver
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"Admin", "admin123"},  // valid login
                {"wrongUser", "wrongPass"} // invalid login
        };
    }


}
