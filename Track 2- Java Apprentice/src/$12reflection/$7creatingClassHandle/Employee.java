package $12reflection.$7creatingClassHandle;

import java.util.Random;

public class Employee {

    private static final Random employeeIdGenerator = new Random();

    private int employeeId;

    public Employee() {
        this.employeeId = Math.abs(employeeIdGenerator.nextInt());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
