package TestNGPractice.TestNGAnnotation;
import org.testng.annotations.*;
public class PriorityTest {

        @Test(priority = 1)
        public void TestPriority1(){

            // Lower the priority, more important is the tests case.
            // A high priority (lease number) test case will execute first
            // Priority takes only integer values
            System.out.println("priority_One - This will execute first");
        }

        @Test(priority = 2)
        public void TestPriority3() {
            System.out.println("priority_Two - This will execute next");
        }

        @Test(priority = 3)
        public void TestPriority4() {
            System.out.println("priority_Three - This will be the third test to execute");
        }

        @Test(priority = 4)
        public void TestPriority2() {
            System.out.println("priority_Four - This will execute Last");
        }

        @Test(priority = -4)
        public void TestPriority5() {
            // TestNG supports negative priorities and since -4 < 1, this negative priority
            // test will execute first

            System.out.println("priority_Four - This will execute Before Priority 1 Test");
        }

    }

