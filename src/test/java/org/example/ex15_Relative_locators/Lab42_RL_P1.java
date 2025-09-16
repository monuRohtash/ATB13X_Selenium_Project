package org.example.ex15_Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


//📄 Relative Locators in Selenium 4
//Relative Locators ke types:
//
//above() → jo element diya gaya uske upar wala element locate karega
//
//below() → jo element diya gaya uske neeche wala element locate karega
//
//toLeftOf() → jo element diya gaya uske left side ka element locate karega
//
//toRightOf() → jo element diya gaya uske right side ka element locate karega
//
//near() → jo element diya gaya uske paas wala element locate karega (50 pixels ke andar by default)


public class Lab42_RL_P1 {

    public static void main(String[] args) throws InterruptedException {

        //    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");


        // ✅  toRightOf()
        WebElement toRightOf = driver.findElement(with(By.id("exp-5"))
                .toRightOf(By.xpath("//span[text()=\"Years of Experience\"]")));
        toRightOf.click();

        Thread.sleep(2000);

        // ✅  near()
        WebElement near = driver.findElement(with(By.id("exp-0"))
                .near(By.xpath("//span[text()=\"Years of Experience\"]")));
        near.click();

        Thread.sleep(2000);

        // ✅  below()
        WebElement below = driver.findElement(with(By.id("exp-1"))
                .below(By.xpath("//label[@class='radio']")));
        below.click();

        Thread.sleep(2000);

        // ✅  above()
        WebElement above = driver.findElement(with(By.id("exp-3"))
                .above(By.xpath("//input[@id='datepicker']")));
        above.click();


    }

}
