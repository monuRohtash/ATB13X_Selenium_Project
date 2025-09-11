package org.example.ex11_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab38_FileUpload_Desktop {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");


        WebElement uploadFileInput = driver.findElement(By.id("photo"));

        // Desktop Path
        String path =  "/home/raghav/Downloads/QA.pdf";

        uploadFileInput.sendKeys(path);

//        driver.quit();

    }
}
