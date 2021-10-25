package $12reflection.$11classPackageSuperclass;

import java.util.Random;

public class Employee {

    private static final Random employeeIdGenerator = new Random();

    private final int employeeId;

    private Salary salary;

    public Employee() {
        this.employeeId = Math.abs(employeeIdGenerator.nextInt());
    }

    public Employee(double baseSalary, float bonusPercentage) {
        this();

        this.salary = new Salary(baseSalary, bonusPercentage);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Salary getSalary() {
        return salary;
    }

    public class Salary {

        private final double baseSalary;
        private final float bonusPercentage;

        public Salary(double baseSalary, float bonusPercentage) {
            this.baseSalary = baseSalary;
            this.bonusPercentage = bonusPercentage;
        }

        @Override
        public String toString() {
//            NOTE: A member class is associated with an instance of the outer class and can access
//            the private member of the outer class
            return String.format("ID: %d, Base Salary: %f, Bonus Percentage: %f", employeeId, baseSalary, bonusPercentage);
        }

    }
}
