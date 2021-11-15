package $13reflectionConstructorsMethodsFields.$4settingFieldValue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main2 {

    /**
     * Getting and Setting Field Values
     *
     * Examining the modifier of each of our field values
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$4settingFieldValue.Employee");
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

    }

}
