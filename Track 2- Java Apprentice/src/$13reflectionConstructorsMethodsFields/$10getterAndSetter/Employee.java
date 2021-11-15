package $13reflectionConstructorsMethodsFields.$10getterAndSetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class Employee {

    private static final transient Random employeeIdGenerator = new Random();

    private int employeeId;
    public String name = "Unknown";
    public String title = "Unknown";
    private double salary = 0.0;

    private Employee() {}

    /* factory method which create new instance of Employee class */
    public static Employee createEmployee(String name, String title, double salary) {
        Employee employee = new Employee();
        employee.employeeId = Math.abs(employeeIdGenerator.nextInt());
        employee.name = name;
        employee.title = title;
        employee.salary = salary;

        return employee;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private double computeBonusPercentage(float bonusPercentage) {
        return salary * bonusPercentage;
    }

    public double computeTotalSalary(float bonusPercentage) {
        return salary + computeBonusPercentage(bonusPercentage);
    }

    public void incrementSalary(float percentageIncrement) {
        salary = salary + percentageIncrement * salary;
    }

    public boolean save() throws IllegalAccessException {
        System.out.println("save() with no argument saves to the default location");
        return true;
    }

    public boolean save(String filename) throws IllegalAccessException, InterruptedException {
        /* NOTE: Assume that this saves to a file on your local machine */
        System.out.println("save(filename): " + filename);
        return true;
    }

    protected boolean save(String connectionString, String username, String password) throws IllegalAccessException, InterruptedException, ExecutionException {
        /* Assume that this saves to a database */
        System.out.println("save(connectionString, username, password)");
        return true;
    }

    @Deprecated
    @SuppressWarnings("unchecked")
    public void printEmployeeDetails() {
        System.out.println(employeeId + name);
        List someList = new ArrayList();
        someList.add("element in unchecked list");
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Title: %s, Salary: %.1f",
                employeeId, name, title, salary);
    }
}
