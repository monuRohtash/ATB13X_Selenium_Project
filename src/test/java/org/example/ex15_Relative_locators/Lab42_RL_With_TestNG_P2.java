package org.example.ex15_Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Lab42_RL_With_TestNG_P2 {


    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
        Thread.sleep(2000);
    }

    @Test
    public void testToRightOf() throws InterruptedException {
        WebElement toRightOf = driver.findElement(
                with(By.id("exp-5")).toRightOf(By.xpath("//span[text()='Years of Experience']")));
        toRightOf.click();
        Thread.sleep(2000);

        Assert.assertTrue(toRightOf.isSelected(), "exp-5 should be selected (toRightOf)");
    }

    @Test
    public void testNear() throws InterruptedException {
        WebElement near = driver.findElement(
                with(By.id("exp-0")).near(By.xpath("//span[text()='Years of Experience']")));
        near.click();
        Thread.sleep(2000);

        Assert.assertTrue(near.isSelected(), "exp-0 should be selected (near)");
    }

    @Test
    public void testBelow() throws InterruptedException {
        WebElement below = driver.findElement(
                with(By.id("exp-1")).below(By.xpath("//label[@class='radio']")));
        below.click();
        Thread.sleep(2000);

        Assert.assertTrue(below.isSelected(), "exp-1 should be selected (below)");
    }

    @Test
    public void testAbove() throws InterruptedException {
        WebElement above = driver.findElement(
                with(By.id("exp-3")).above(By.xpath("//input[@id='datepicker']")));
        above.click();
        Thread.sleep(2000);

        Assert.assertTrue(above.isSelected(), "exp-3 should be selected (above)");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();

    }

}
