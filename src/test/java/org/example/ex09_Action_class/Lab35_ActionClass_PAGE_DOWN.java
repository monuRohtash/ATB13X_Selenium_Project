package org.example.ex09_Action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab35_ActionClass_PAGE_DOWN {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();



// Scroll down using PAGE_DOWN
        actions.sendKeys(Keys.PAGE_DOWN).perform();

// Scroll up using PAGE_UP
        actions.sendKeys(Keys.PAGE_UP).perform();

// Scroll to bottom
        actions.sendKeys(Keys.END).perform();


    }
}
