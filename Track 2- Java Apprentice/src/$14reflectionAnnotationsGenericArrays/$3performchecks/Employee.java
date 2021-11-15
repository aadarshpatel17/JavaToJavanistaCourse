package $14reflectionAnnotationsGenericArrays.$3performchecks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Required
public class Employee {

    private static final transient Random employeeIdGenerator = new Random();

    @Required
    private final int employeeId;
    public String name = "Unknown";
    public String title = "Unknown";
    private double salary = 0.0;

    @Deprecated
    private String department = "Unknown";

    public Employee(@Required String name, @Required String title,
                    @Required @InRange(minValue = 10000, maxValue = 1000000) double salary) {
        this.employeeId = Math.abs(employeeIdGenerator.nextInt());
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    @Required
    public int getEmployeeId() {
        return employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(@Required String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(@Required String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(@Required @InRange(minValue = 10000, maxValue = 1000000 ) double salary) {
        this.salary = salary;
    }

    @Deprecated
    public String getDepartment() {
        return department;
    }

    @Deprecated(forRemoval = true, since = "v9")
    public void setDepartment(String department) {
        this.department = department;
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
