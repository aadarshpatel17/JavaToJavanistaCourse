package $12reflection.$8modifiersOfClassMembers;

import java.lang.reflect.Modifier;

public class Main {

    /**
     * Viewing Modifiers of Class Members
     *  -
     *
     * How we can query all the properties of class object
     * For instance, its modifiers, whether it's final, public, static and so on.
     */

    private static final class HR extends Department {
        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> organizationClass = Class.forName("$12reflection.$8modifiersOfClassMembers.Organization");
        Class<?> employeeClass = Class.forName("$12reflection.$8modifiersOfClassMembers.Employee");
        Class<?> hrClass = Class.forName("$12reflection.$8modifiersOfClassMembers.Main$HR");
        Class<?> departmentClass = Class.forName("$12reflection.$8modifiersOfClassMembers.Department");

        System.out.println("***************** Organization");
        int organizationModifiers = organizationClass.getModifiers();
        System.out.println("Organization class modifier: " + organizationModifiers);
        System.out.println("Organization class modifier in binary format: " + Integer.toBinaryString(organizationModifiers));

        System.out.println("Public: " + Modifier.isPublic(organizationModifiers));
        System.out.println("Final: " + Modifier.isFinal(organizationModifiers));
        System.out.println("Abstract: " + Modifier.isAbstract(organizationModifiers));
        System.out.println("Static: " + Modifier.isStatic(organizationModifiers));
        System.out.println();

        System.out.println("***************** Department");
        int departmentModifiers = departmentClass.getModifiers();
        System.out.println("Organization class modifier: " + departmentModifiers);
        System.out.println("Organization class modifier in binary format: " + Integer.toBinaryString(departmentModifiers));

        System.out.println("Public: " + Modifier.isPublic(departmentModifiers));
        System.out.println("Abstract: " + Modifier.isAbstract(departmentModifiers));
        System.out.println();

        System.out.println("***************** HR");
        int hrModifiers = hrClass.getModifiers();
        System.out.println("Organization class modifier: " + hrModifiers);
        System.out.println("Organization class modifier in binary format: " + Integer.toBinaryString(hrModifiers));

        System.out.println("Private: " + Modifier.isPrivate(hrModifiers));
        System.out.println("Final: " + Modifier.isFinal(hrModifiers));
        System.out.println("Static: " + Modifier.isStatic(hrModifiers));
        System.out.println();

        System.out.println("***************** Employee");
        int employeeModifiers = employeeClass.getModifiers();
        System.out.println("Organization class modifier: " + employeeModifiers);
        System.out.println("Organization class modifier in binary format: " + Integer.toBinaryString(employeeModifiers));

        System.out.println("Public: " + Modifier.isPublic(employeeModifiers));
        System.out.println();

    }

}
