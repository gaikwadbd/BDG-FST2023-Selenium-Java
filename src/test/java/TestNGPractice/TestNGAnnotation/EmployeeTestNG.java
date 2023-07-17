package TestNGPractice.TestNGAnnotation;

import TestNGPractice.BusinessLogic;
import TestNGPractice.Employess;
import org.testng.annotations.*;
import org.testng.Assert;


public class EmployeeTestNG {



        // We will implement simple test method to test Employee and EmpBusinessLogic
        BusinessLogic empBusinessLogic = new BusinessLogic();
        Employess employee = new Employess();

        @Test
        public void testCalculateAppriasal() {
            // Test the appraisal amount of the employee.

            employee.setName("Rajeev");
            employee.setAge(25);
            employee.setMonthlySalary(8000);

            double appraisal = empBusinessLogic.calculateAppraisal(employee);

            // Assertion class is provided by TestNG
            Assert.assertEquals(500, appraisal, 0.0, "500");
        }

        // Test to check yearly salary
        @Test
        public void testCalculateYearlySalary() {

            employee.setName("Rajeev");
            employee.setAge(25);
            employee.setMonthlySalary(8000);

            double salary = empBusinessLogic.calculateYearlySalary(employee);
            Assert.assertEquals(96000, salary, 0.0, "8000");
        }
    }

