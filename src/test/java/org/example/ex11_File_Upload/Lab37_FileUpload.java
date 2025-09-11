package org.example.ex11_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab37_FileUpload {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");


        WebElement uploadFileInput = driver.findElement(By.id("photo"));

        String user_dir = System.getProperty("user.dir");
//    /home/raghav/IdeaProjects/ATB13X_Selenium_Project/

        String path = user_dir + "/src/test/java/org/example/ex11_File_Upload/TestData.txt";

        uploadFileInput.sendKeys(path);

    }

}
