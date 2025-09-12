package org.example.ex014DataDrivenExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab02_TestDataDrivenTesting_Parallel {


    @DataProvider(name = "loginData", parallel = true)
    public Object[][] getdata() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", " password"},
                new Object[]{"admin@gmail.com", " password"},
                new Object[]{"admin@gmail.com", " password"}
        };

    }


    @Test(dataProvider = "loginData")
    public void logintest(String email, String password) {
        System.out.println(email + " | " + "password");

    }


}
