package org.example.ex09_Action_class;

import org.example.ex07_WaitHelper.WaitHelpers;
import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab34_ActionClass_MakeMyTRIP_example extends CommonToAll {

    @Test
    public void test_Action() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

//        // We need to for the modal and close it
//        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='commonModal__close']")));
        modal.click();


        WaitHelpers.waitJVM(5000);

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        WaitHelpers.waitJVM(3000);

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        try {
            for (WebElement e : list_auto_complete) {

                if (e.getText().contains("Chandigarh")) {
                    e.click();


                }

            }
        } catch (Exception e) {

            System.out.println("OK");
        }


         Thread.sleep(3000);
        closeBrowser(driver);


    }
}
