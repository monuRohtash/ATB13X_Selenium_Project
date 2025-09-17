package org.example.ex018DataDrivenTestWith_OHRM;

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

public class Lab_50_DDT_TestNG_OHRM_ {

    WebDriver driver;

    @BeforeMethod
    public void Setup() {
        driver = new ChromeDriver();   // ✅ class-level driver को initialize किया
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getCurrentUrl() + " | " + driver.getTitle());
    }

    @Test(dataProvider = "getdata", enabled = true, priority = 1)
    public void OrangeHRM_Invalid_Login(String email, String password) throws InterruptedException {

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement usernameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernameInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);

        WebElement loginBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginBtn.click();

//// (Optional) verify login success
//        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
//        System.out.println("Login successful! Page Title: " + driver.getTitle());


        // Locate the error message
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
        Assert.assertEquals(errorMsg.getText(), "Invalid credentials");
        System.out.println(errorMsg.getText());

    }

    @Test(dataProvider = "getdata", enabled = true, priority = 2)
    public void OrangeHRM_Valid_Login(String email, String password) {

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement usernameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernameInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);

        WebElement loginBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginBtn.click();

// (Optional) verify login success
        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        System.out.println("Login successful! Page Title: " + driver.getTitle());


//        // Locate the error message
//        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-alert-content-text")));
//        Assert.assertEquals(errorMsg.getText(),"Invalid credentials");


    }


    @AfterMethod
    public void TearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider
    public Object[][] getdata() {
        return UtilExcel.getTestDataFromExcel("sheet1");
    }

}
