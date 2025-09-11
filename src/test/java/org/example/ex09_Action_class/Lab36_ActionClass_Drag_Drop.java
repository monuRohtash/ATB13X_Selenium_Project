package org.example.ex09_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab36_ActionClass_Drag_Drop {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo site
        driver.get("https://jqueryui.com/droppable/");



        // Switch to iframe (because the demo is inside an iframe)
        driver.switchTo().frame(0);

        // Locate source (draggable) and target (droppable)
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Perform Drag and Drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        Thread.sleep(2000);
        driver.quit();



}




}
