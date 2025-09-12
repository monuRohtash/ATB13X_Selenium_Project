package org.example.ex014DataDrivenExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab01_DataDrivenTesting {

    @DataProvider
    public Object[][] getdata() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123 "},
                new Object[]{"user@gmail.com", "pass123 "},
                new Object[]{"amit@gmail.com", "pass123 "},
                new Object[]{"raghav@gmail.com", "pass123 "},
                new Object[]{"monu@gmail.com", "pass123 "},

        };
    }


    @Test(dataProvider = "getdata")
    public void login_Test(String email, String password) {
        System.out.println(email + " | " + password);

    }





}
