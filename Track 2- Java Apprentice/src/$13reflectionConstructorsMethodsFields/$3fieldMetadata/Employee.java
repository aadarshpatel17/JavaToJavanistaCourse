package $13reflectionConstructorsMethodsFields.$3fieldMetadata;

import $12reflection.$9anonymousLocal.Department;

import java.util.List;
import java.util.Random;

public class Employee {

    enum Type {
        FULLTIME,
        CONTRACT
    }

    private static final transient Random employeeIdGenerator = new Random();

    private final int employeeId;
    public String name = "Unknown";
    public String title = "Unknown";
    private double salary = 0.0;

    private Department department;

    /* volatile use for atomic access. By marking member variable as volatile, we are reducing the risk of memory
    *  consistency errors for multi-threaded applications */
    public volatile List<String> committees;

    protected Type employeeType = Type.FULLTIME;

    public Employee() {
        this.employeeId = Math.abs(employeeIdGenerator.nextInt());
    }

    public Employee(String name, String title, double salary) {
        this();
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Title: %s, Salary: %.1f, Dept: %s, Committees: %s, Type: %s",
                employeeId, name, title, salary, department, committees, employeeType);
    }
}
