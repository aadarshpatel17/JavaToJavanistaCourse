package $14reflectionAnnotationsGenericArrays.$4checkingobjects;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {

    /**
     * Scenario: Checking Objects for Validity
     */

    private static void checkEmployeeObjectForValidity(Employee employee) throws IllegalAccessException {
        boolean valid = true;
        Field[] fields = employee.getClass().getDeclaredFields();

        for(Field field: fields) {
            Annotation[] annotations = field.getAnnotations();

            for(Annotation annotation: annotations) {
                if(annotation instanceof Required) {
                    field.setAccessible(true);
                    if(field.get(employee) == null) {
                        valid = false;
                        System.out.println("** Field is null: " + field.getName());
                    }
                }
                if(annotation instanceof InRange) {
                    InRange inRange = (InRange) annotation;
                    double value = field.getDouble(employee);
                    if(value < inRange.minValue() || value > inRange.maxValue()) {
                        valid = false;
                        System.out.println(String.format("** Field is not in range: %s (%.1f %.1f)", field.getName(), inRange.minValue(), inRange.maxValue()));
                    }
                }
            }
        }

        if(valid) {
            System.out.println("All fields are valid! " + employee);
        } else {
            System.out.println("Please fix issues with invalid fields " + employee);
        }
    }

    public static void main(String[] args) throws IllegalAccessException {

        System.out.println("********* object is valid");
        Employee employee = new Employee("John", "VP", 112000);
        checkEmployeeObjectForValidity(employee);

        System.out.println("********* object is invalid");
        employee = new Employee("Jill", null, 112000);
        checkEmployeeObjectForValidity(employee);

        System.out.println("********* object is invalid");
        employee = new Employee(null, null, 112000);
        checkEmployeeObjectForValidity(employee);

        System.out.println("********* object is invalid");
        employee = new Employee("Nick", "Manager", 5000);
        checkEmployeeObjectForValidity(employee);

    }

}
