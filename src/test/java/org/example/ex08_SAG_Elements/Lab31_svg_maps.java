package org.example.ex08_SAG_Elements;

import org.example.ex07_WaitHelper.WaitHelpers;
import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class Lab31_svg_maps extends CommonToAll {

    @Test
    public void test_India_map_SVG() {

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();

        WaitHelpers waitHelpers = new WaitHelpers();

        waitHelpers.waitForVisibility(driver,3,"//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']");

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state: states) {
            System.out.println(state.getDomAttribute("aria-label"));


            if(Objects.requireNonNull(state.getDomAttribute("aria-label")).contains("Tripura")){
                state.click();
            }

        }


        closeBrowser(driver);


    }
    }
