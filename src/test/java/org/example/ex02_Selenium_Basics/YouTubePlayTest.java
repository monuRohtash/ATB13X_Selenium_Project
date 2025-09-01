package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class YouTubePlayTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void playTumHiHoSong() throws InterruptedException {
        // 1. Open YouTube
        driver.get("https://www.youtube.com");

        // 2. Find search box and type query
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("Tum Hi Ho song");
        searchBox.sendKeys(Keys.ENTER);

        // 3. Wait and click first video
        Thread.sleep(3000); // small wait for results
        WebElement firstVideo = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
        firstVideo.click();

        // 4. Let it play for 20 seconds
        Thread.sleep(20000);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }



}
