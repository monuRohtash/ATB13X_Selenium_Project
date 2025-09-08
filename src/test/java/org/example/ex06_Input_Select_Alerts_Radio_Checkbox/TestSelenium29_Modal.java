package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.example.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium29_Modal {

    WebDriver driver;

    @Test
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        WaitHelpers.waitJVM(2000);
        List<WebElement> closeModal = driver.findElements(By.cssSelector("span.commonModal__close"));
        if (!closeModal.isEmpty()) {
            closeModal.get(0).click();
            System.out.println("Modal बंद कर दिया गया।");
        } else {
            System.out.println("कोई Modal नहीं दिखाई दिया।");
        }

        // आगे


    }

}
