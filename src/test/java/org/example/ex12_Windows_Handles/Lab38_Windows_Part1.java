package org.example.ex12_Windows_Handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.PseudoType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Windows_Part1 {

    @Test
    public void test_windows() {
        WebDriver driver = new FirefoxDriver();
        String URL = "https://the-internet.herokuapp.com/windows";

        driver.get(URL);

        // Parent Window का Handle Store करना
        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        System.out.println(driver);

//        ऐसा Link Click करना जो नई Window/Tabs खोले
        WebElement click_here_btn = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        click_here_btn.click();


        // 2 Windows
        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);


        // Loop लगाकर Child Window पर Switch करना
        for (String window : allWindows) {
            if (window.equals(parent_id)) {
                driver.switchTo().window(window);  // Child Window पर स्विच
                System.out.println("Child Window Title: " + driver.getTitle());


            }
//
        }


        // Switch back to parent window
        driver.switchTo().window(parent_id);
        System.out.println("Parent Window Title: " + driver.getTitle());


        driver.quit();  // Browser Close करना

    }


}
