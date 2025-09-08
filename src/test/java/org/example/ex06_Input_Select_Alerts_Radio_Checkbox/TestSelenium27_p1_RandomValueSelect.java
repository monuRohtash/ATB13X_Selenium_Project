package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class TestSelenium27_p1_RandomValueSelect {


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

// Dropdown size निकालना
        int size = select.getOptions().size();

// Random index generate करना (0 से size-1 तक)
        Random random = new Random();
        int randomIndex = random.nextInt(size);

// Random option select करना
        select.selectByIndex(randomIndex);

// Print selected option
        System.out.println("Randomly Selected: " + select.getFirstSelectedOption().getText());


    }
}
