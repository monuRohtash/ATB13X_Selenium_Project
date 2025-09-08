package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium27_Select_Static_p_1 {

    //    Dropdown Select → Fixed value चुनते हैं (हम define करते हैं कौन सा select करना है)।
//
//    Random Value Select → Value dynamically/randomly choose होती है (हर बार result बदल सकता है)।

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());


        WebElement select_element = driver.findElement(By.id("continents"));
        Select select = new Select(select_element);

        // "Australia" select करना
        String country = "Australia";
        select.selectByVisibleText(country);
        //Print
        System.out.println(country);


        driver.quit();

    }


}



