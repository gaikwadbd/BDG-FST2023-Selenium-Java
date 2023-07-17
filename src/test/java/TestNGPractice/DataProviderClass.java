package TestNGPractice;
import org.testng.annotations.DataProvider;
public class DataProviderClass {

        @DataProvider(name = "RandomData")
        public Object[][] getDataFromDifferentClass() {
            return new Object[][]{{"ABC", "123"}, {"DEF", "456"},
                    {"GHI", "789"}};

        }
    }

