package $13reflectionConstructorsMethodsFields.$4settingFieldValue;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    /**
     * Getting and Setting Field Values
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$4settingFieldValue.Employee");

        System.out.println("*********** field modifiers");
        Field[] fields = employeeClass.getDeclaredFields();
        for(Field field: fields) {
            int modifier = field.getModifiers();
            System.out.println("-------");
            System.out.println(field.getName());
            System.out.println(Integer.toBinaryString(modifier));
            System.out.println(Modifier.toString(modifier));
        }
        System.out.println();

    }

}
