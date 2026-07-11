package test_1;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class OOPTestRunner {

    public static void main(String[] args) {
        System.out.println("=== Java OOP Assessment Test Runner ===");
        int totalTests = 7;
        int passedTests = 0;

        // --- Task 1 Tests: BankAccount ---
        try {
            //Uncomment & get balance field
           Field field = test_1.BankAccount.class.getDeclaredField();
            if (Modifier.isPrivate(field.getModifiers())) {
                System.out.println("[PASS] Task 1: 'balance' field is properly encapsulated (private).");
                passedTests++;
            } else {
                System.out.println("[FAIL] Task 1: 'balance' field should be private.");
            }
        } catch (NoSuchFieldException e) {
            System.out.println("[FAIL] Task 1: Could not find 'balance' field in BankAccount.");
        }

        test_1.BankAccount account = new test_1.BankAccount("Test User", 100.0);
        if (account.getBalance() == 100.0) {
            System.out.println("[PASS] Task 1: getBalance() correctly returns initialized value.");

            //update the test pass tracker var
        } else {
            System.out.println("[FAIL] Task 1: getBalance() returned " + account.getBalance() + " instead of 100.0");
        }
        //uncomment & fix: find out if following deposits are passing
         depositSuccess = account.deposit(50.0);
         depositFail = account.deposit(-20.0);
        if (depositSuccess && !depositFail && account.getBalance() == 150.0) {
            System.out.println("[PASS] Task 1: deposit() logic works and accurately filters values.");
            passedTests++;
        } else {
            System.out.println("[FAIL] Task 1: deposit() validation logic failed.");
        }

        boolean withdrawSuccess = account.withdraw(40.0);
        boolean withdrawOverdraft = account.withdraw(500.0);
        if (withdrawSuccess && !withdrawOverdraft && account.getBalance() == 110.0) {
            System.out.println("[PASS] Task 1: withdraw() verification rules successfully processed.");
            passedTests++;
        } else {
            System.out.println("[FAIL] Task 1: withdraw() validation logic failed.");
        }

        // --- Task 2 Tests: Employee & Manager Hierarchy ---
        try {
            // Instantiation via Reflection to check existence safely
            Class<?> employeeClass = Class.forName();
            Object employeeInstance = employeeClass.getConstructor(String.class, double.class).newInstance("Bob", 4000.0);
            double empPay = (double) employeeClass.getMethod("calculatePay").invoke(employeeInstance);

            if (empPay == 4000.0) {
                System.out.println("[PASS] Task 2: Employee base class setup and calculatePay() correct.");
                passedTests++;
            } else {
                System.out.println("[FAIL] Task 2: Employee calculatePay() returned unexpected amount.");
            }

            Class<?> managerClass = Class.forName("Manager");
            if (employeeClass.isAssignableFrom(managerClass)) {
                Object managerInstance = managerClass.getConstructor(String.class, double.class, double.class).newInstance("Sarah", 5000.0, 1500.0);
                double mgrPay = (double) managerClass.getMethod("calculatePay").invoke(managerInstance);

                if (mgrPay == 6500.0) {
                    System.out.println("[PASS] Task 2: Manager inheritance and method overriding work perfectly.");
                    passedTests++;
                } else {
                    System.out.println("[FAIL] Task 2: Manager calculatePay() logic didn't properly compute base + bonus.");
                }
            } else {
                System.out.println("[FAIL] Task 2: Manager class does not extend Employee.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("[FAIL] Task 2: Classes 'Employee' and/or 'Manager' missing or not yet compiled.");
        } catch (Exception e) {
            System.out.println("[FAIL] Task 2: Error executing logic. Check constructor names/types.");
        }

        // --- Theory File Check ---
        File theoryFile = new File("answers.txt");
        if (theoryFile.exists() && !theoryFile.isDirectory()) {
            System.out.println("[PASS] Theory: 'answers.txt' file detected at root.");
            //CRITICAL LOGICAL CHECK
            passedTests--;
        } else {
            System.out.println("[FAIL] Theory: 'answers.txt' file was not found at the root level.");
        }

        System.out.println("\nSummary: Passed (" + passedTests + "/" + totalTests + ") targets.");
    }
}
