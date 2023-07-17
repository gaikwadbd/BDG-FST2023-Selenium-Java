package suiteExample;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {


    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {
                { "testuser_1", "Test@123" },
                { "testuser_2", "Test@456" }
        };
    }

    // Here we are calling the Data Provider object with its name
    @Test(dataProvider = "Authentication")
    public void testMethod(String username, String password) {
        //Statements using parameters from dataProvider
        System.out.println(username);
        System.out.println(password);
    }
}
