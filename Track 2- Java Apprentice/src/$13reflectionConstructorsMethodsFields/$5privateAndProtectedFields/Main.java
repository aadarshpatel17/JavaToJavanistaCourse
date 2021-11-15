package $13reflectionConstructorsMethodsFields.$5privateAndProtectedFields;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Accessing and Updating Private and Protected Fields
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$5privateAndProtectedFields.Employee");
        /* instantiating an instance of Employee class (no argument constructor) */
        Employee employee = (Employee) employeeClass.getConstructor().newInstance();
        System.out.println(employee);

        System.out.println("*********** setting name and title");
        /* Accessing name field of Employee class */
        Field nameField = employeeClass.getField("name");
        /* setting a value to the name field of Employee */
        nameField.set(employee, "Jason");

        /* Accessing title field of Employee class */
        Field titleField = employeeClass.getField("title");
        /* setting a value to the title field of Employee */
        titleField.set(employee, "Analyst");

        System.out.println(employee);

        /* getting value of name field from Employee class */
        System.out.println("Name: " + nameField.get(employee));
        /* getting value of title field from Employee class */
        System.out.println("Title: " + titleField.get(employee));

        System.out.println();

        System.out.println("********* setting salary");
        Field salaryField = employeeClass.getDeclaredField("salary");
        salaryField.setAccessible(true);
        salaryField.setDouble(employee, 125000);
        System.out.println(employee);
        System.out.println("Salary: " + salaryField.getDouble(employee));
        System.out.println();

        System.out.println("********* setting employeeId");
        Field employeeIdField = employeeClass.getDeclaredField("employeeId");
        employeeIdField.setAccessible(true);
        employeeIdField.setInt(employee, 1001);
        System.out.println(employee);
        System.out.println("Employee ID: " + employeeIdField.getInt(employee));
        System.out.println();

        System.out.println("**************** setting employee department, committees, type");

        Field departmentField = employeeClass.getDeclaredField("department");
        Field committeesField = employeeClass.getDeclaredField("committees");
        Field employeeTypeField = employeeClass.getDeclaredField("employeeType");

        class Engineering extends Department {
            Engineering() {
                super("Engineering");
            }
        }

        departmentField.setAccessible(true);
        departmentField.set(employee, new Engineering());

        List<String> committeesList = new ArrayList<>();
        committeesList.add("Promotion");
        committeesList.add("Christmas");

        committeesField.set(employee, committeesList);

        employeeTypeField.setAccessible(true);
        employeeTypeField.set(employee, Employee.Type.CONTRACT);

        System.out.println(employee);
        System.out.println("Employee department:" + departmentField.get(employee));
        System.out.println("Employee committees:" + committeesField.get(employee));
        System.out.println("Employee type:" + employeeTypeField.get(employee));

    }

}
