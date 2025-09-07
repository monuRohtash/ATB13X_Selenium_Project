package org.example.ex05_Selenium_Waits;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium22_Implicit_Wait {



//    ✅ Simple Explanation in Hindi:
//
//    Implicit Wait → पूरे driver session के लिए default इंतज़ार।   -> never use this
//
//    Explicit Wait → किसी खास condition या element के लिए इंतज़ार।
//
//    Fluent Wait → advanced इंतज़ार, polling और ignore condition के साथ।


    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://app.vwo.com");
        /// e1,e2,2

    }

}
