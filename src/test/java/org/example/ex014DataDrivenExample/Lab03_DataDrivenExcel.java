package org.example.ex014DataDrivenExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;

import java.util.Objects;

public class Lab03_DataDrivenExcel {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }



    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void loginTest(String username, String password) throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000); // demo purpose, real में WebDriverWait use करें

        if (username.equals("Admin") && password.equals("admin123")) {
            // valid login
            Assert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("dashboard"), "Login failed for valid user");
        }
//        else {
//            // invalid login
//            boolean error = !driver.findElements(By.xpath("//*[contains(text(),'Invalid credentials')]")).isEmpty();
//            Assert.assertTrue(error, "Error not shown for invalid credentials");
//        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}



