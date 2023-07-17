package suiteExample;

import org.testng.annotations.Test;

public class DemoTwo {
    @Test(groups = { "Car" })
    public void Car11() {
        System.out.println("Batch Car - Test car 1");
    }

    @Test (groups = { "Car" })
    public void Car12() {
        System.out.println("Batch Car - Test car 2");
    }
}
