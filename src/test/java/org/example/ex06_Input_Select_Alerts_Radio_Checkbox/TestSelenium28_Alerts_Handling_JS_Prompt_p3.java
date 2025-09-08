package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium28_Alerts_Handling_JS_Prompt_p3 {


    @Test
    public void test_alert() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts"); // Demo site
        System.out.println(driver.getTitle());


        WebElement element = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        element.click();


        Alert alert = driver.switchTo().alert();
        // Input डालना
        String name ="Automation";

        alert.sendKeys(name);

        alert.accept();


        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: " + name);


        driver.quit();


    }
}
