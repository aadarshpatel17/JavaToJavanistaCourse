package $12reflection.$3fieldsMethodsAndModifiers;

import java.util.Random;

public class Employee {

    public static final String ORGANIZATION = "Skillsoft";

    private static final Random employeeIdGenerator = new Random();

    private int employeeId;
    private String name;
    private String title;
    private double salary;

    public Employee() {
        this.employeeId = Math.abs(employeeIdGenerator.nextInt());
    }

    public Employee(String name, String title, double salary) {
        this();

        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public static Random getEmployeeIdGenerator() {
        return employeeIdGenerator;
    }

    private double computeBonusInternal(float bonusPercentage) {
        return salary * bonusPercentage;
    }

    public double computeTotalSalary(float bonusPercentage) {
        return salary + computeBonusInternal(bonusPercentage);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Title: %s, Salary: %f", employeeId, name, title, salary);
    }
}
