package org.example.ex13_Javascript_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab40_JS_Code {


    @Test
    public void test_js() {


        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //👉 Driver को JavaScriptExecutor में Cast किया जाता है ताकि हम JS commands चला सकें।

        js.executeScript("window.location = 'https://www.google.com'");
       //👉 JavaScript के ज़रिए Browser को Google.com पर Redirect करता है।


        // 2. Selenium से दूसरी साइट खोलना
        driver.get("https://selectorshub.com/xpath-practice-page/");

        // 3. एक WebElement ढूँढना (scroll करने के लिए)
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        // 4. JS से Page को नीचे Scroll करना (500px)
        js.executeScript("window.scrollBy(0, 500);");
        js.executeScript("window.scrollBy(0, 500);");

        // 5. JS से Current URL और Title निकालना
        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();


        // 6. Console पर Print करना
        System.out.println(url);
        System.out.println(title);

        // 7. Browser बंद करना
        driver.quit();
    }
    }
