package data;

import org.testng.annotations.DataProvider;

public class TestsDataProvider {
    @DataProvider(name = "purchase data")
    public static Object [][] getPurchaseData(){
        return new Object[][]{
                {"John", "Doe", "12345"}
        };
    }
}
