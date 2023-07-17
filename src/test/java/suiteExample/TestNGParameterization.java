package suiteExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterization {
    @Test
    @Parameters({ "sUsername", "sPassword" })
    public void test(String sUsername, String sPassword) {
        //Statements that use sUsername and sPassword.
        System.out.println(sUsername);
        System.out.println(sPassword);

   }
}
