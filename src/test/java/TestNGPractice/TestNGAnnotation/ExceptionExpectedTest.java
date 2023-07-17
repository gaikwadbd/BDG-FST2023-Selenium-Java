package TestNGPractice.TestNGAnnotation;
import java.io.IOException;
import org.testng.annotations.*;
public class ExceptionExpectedTest {


        String message = "Some Message To Verify";

        /**
         *
         */
        @Test(expectedExceptions = ArithmeticException.class)
        public void airthmeticExceptionTestPass() {
            // This test case throws a "Divide by Zero" arithmetic exception
            // but as the exception is expected, the test will pass

            int zero = 0;
            int i = 10 / zero; // Divide by zero
            System.out.println(i + "Generated an exception - Test Should Pass");
        }

        @Test(expectedExceptions = ArithmeticException.class)
        public void airthmeticExceptionTestFailed() {
            // This test case also throws a "Divide by Zero" arithmetic exception
            // exception is not expected, the test will FAIL

            System.out.println("Expected exception is not generated - Test Should Fail");
        }

        @Test
        public void airthmeticExceptionTestFailed2() {
            // This test case also throws a "Divide by Zero" arithmetic exception
            // exception is not expected, the test will FAIL

            int zero = 0;
            int i = 10 / zero; // Divide by zero
            System.out.println(i + "Generated an exception - Test Should Fail");
        }

        @Test(expectedExceptions = IOException.class)
        public void IOExceptionTestPass() throws IOException {
            // This test case also throws a "IOException"
            // exception is expected, the test will PASS
            System.out.println("Generated an exception - Test Should Pass");
            IOException ex = new IOException();
            throw ex;

        }

    }
