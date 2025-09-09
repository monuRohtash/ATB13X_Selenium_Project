package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSelenium26_Input_Checkbox_Radio {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");


        //Input Box
        WebElement first_name = driver.findElement(By.name("firstname"));
        first_name.sendKeys("Automation Testing");

        WebElement last_name = driver.findElement(By.name("firstname"));
        last_name.sendKeys("Selenium Testng");



        // Radio button

        WebElement gender = driver.findElement(By.id("sex-0"));
        gender.click();

        WebElement radio_btn = driver.findElement(By.id("exp-1"));
        radio_btn.click();

        // Date Input

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("01-11-1996");


        //Check box
        WebElement Profession = driver.findElement(By.id("profession-1"));
        Profession.click();

        WebElement Automation_Tools = driver.findElement(By.id("tool-2"));
        Automation_Tools.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



//  driver.quit();


    }}
