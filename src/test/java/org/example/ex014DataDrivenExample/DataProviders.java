package org.example.ex014DataDrivenExample;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        String path = System.getProperty("user.dir") + "/src/test/java/org/example/ex014DataDrivenExample/LoginData.xlsx";
        return ExcelUtility.getData(path, "Sheet1");
    }


}
