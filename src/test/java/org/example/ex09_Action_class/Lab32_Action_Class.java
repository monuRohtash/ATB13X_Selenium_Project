package org.example.ex09_Action_class;

import org.example.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.Stack;

public class Lab32_Action_Class {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        // Wait until the input box is visible
        WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input")));

        Actions actions = new Actions(driver);
        // move to element
        // click
        // sendkeys -BLR

        // Perform actions after element is visible
        actions.moveToElement(source)
                .click()
                .sendKeys("BLR")
                .build()
                .perform();


        // Wait until the input box is visible
        WebElement source2 = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
        // Perform actions after element is visible
        actions.moveToElement(source2)
                .click()
                .sendKeys("DEL")
                .build()
                .perform();







//
        // ✅ Search Flight Button
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@data-testid='home-page-flight-cta']/div")));


        actions.moveToElement(searchBtn)
                .click()
                .build()
                .perform();

        System.out.println("✅ Flight search executed successfully!");


    }
}
