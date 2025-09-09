package org.example.ex08_SAG_Elements;

import com.sun.source.tree.WhileLoopTree;
import org.example.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class Lab30_SVG {

    @Test
    public void test_Flipkart_Search_ICON() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "https://www.flipkart.com/search";
        driver.get(URL);


        WebElement search_inputr = driver.findElement(By.name("q"));
        search_inputr.sendKeys("macmini");

//        List<WebElement> svgElements = driver.findElements(By.xpath("//button[@type='submit']"));
//        svgElements.get(0).click();


        WebElement svgElements = driver.findElement(By.xpath("//button[@type='submit']"));
        svgElements.click();


        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }


        //Until next button is visible , for loop
        WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
        while (next_button.isDisplayed()){

            WebElement next_button_page2 = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_button_page2.click();



            List<WebElement> titlesResults2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
            for (WebElement title : titlesResults2) {
                title.getText();
                System.out.println(title.getText());
            }





        }











    }


}
