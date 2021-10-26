package $13reflectionConstructorsMethodsFields.$3fieldMetadata;

import java.lang.reflect.Field;

public class Main {

    /**
     * Accessing Field Metadata
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        /* instantiating the employeeClass */
        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$3fieldMetadata.Employee");

        System.out.println("******** public fields");
        Field[] fields = employeeClass.getFields();
        for(Field field: fields) {
            System.out.println(field);
        }
        System.out.println();

        System.out.println("******** public + protected + private fields");
        fields = employeeClass.getDeclaredFields();
        for(Field field: fields) {
            System.out.println(field);
        }
        System.out.println();

        System.out.println("******** field names, types, generic types");
        for(Field field: fields) {
            System.out.println("----");
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Generic type: " + field.getGenericType());
        }
        System.out.println();

        System.out.println("************ accessing fields by name");
        Field nameField = employeeClass.getField("name");
        Field titleField = employeeClass.getField("title");
        Field committeesField = employeeClass.getField("committees");

        System.out.println(nameField);
        System.out.println(titleField);
        System.out.println(committeesField);
        System.out.println();

//        System.out.println("********* accessing private fields by name (error)");
//        Field salaryField = employeeClass.getField("salary");
//        Field employeeIdField = employeeClass.getField("employeeId");
//        System.out.println();

        System.out.println("********* accessing private fields by name using getDeclaredField()");
        Field salaryField = employeeClass.getDeclaredField("salary");
        Field employeeIdField = employeeClass.getDeclaredField("employeeId");
        System.out.println(salaryField);
        System.out.println(employeeIdField);
        System.out.println();

    }

}
