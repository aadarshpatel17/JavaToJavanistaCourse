package $12reflection.$11classPackageSuperclass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * Viewing Class Package, Superclass, Declaring Class
     *  -
     *
     * Here: Type parameters and package information
     */

    private static final class HR extends Department {
        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("**************** isGenericString()");
        Class<?> employeeClass = Class.forName("$12reflection.$11classPackageSuperclass.Employee");
//        inner classes
        Class<?> salaryClass = Class.forName("$12reflection.$11classPackageSuperclass.Employee$Salary");
        Class<?> hrClass = Class.forName("$12reflection.$11classPackageSuperclass.Main$HR");

        class MobileApplication implements Deliverable {
            @Override
            public String getProjectName() {
                return "Mongo Mobile Application";
            }

            @Override
            public String getProjectStatus() {
                return "Deployed";
            }
        }

//        local class
        Class<?> mobileApplicationClass = Class.forName("$12reflection.$11classPackageSuperclass.Main$1MobileApplication");
        /* $1 in the above line is because there may be number of local classes and that can be of same name too. Thus,
           we are specifying that the first of them. */

        System.out.println(employeeClass.toGenericString());
        System.out.println(salaryClass.toGenericString());
        System.out.println(hrClass.toGenericString());
        System.out.println(mobileApplicationClass.toGenericString());

        System.out.println();

        System.out.println("********* packages");

        Package employeeClassPackage =  employeeClass.getPackage();
        Package mobileApplicationPackage = mobileApplicationClass.getPackage();

        System.out.println("Employee package: " + employeeClassPackage);
        System.out.println("MobileApplication package: " + mobileApplicationPackage);

        Set<Integer> set = new HashSet<>();

        System.out.println("Set package: " + set.getClass().getPackage());
        System.out.println("Double package: " + Double.class.getPackage());

        System.out.println();

        System.out.println("***************** Superclass");

        System.out.println("Employee superclass: " + employeeClass.getSuperclass());
        System.out.println("MobileApplication superclass: " + mobileApplicationClass.getSuperclass());
        System.out.println("HR superclass: " + hrClass.getSuperclass());
        System.out.println("Set superclass: " + set.getClass().getSuperclass());
        /* From above line, set.getClass().getSuperclass() implements getClass() method on HashSet class object
        *  not on the Set interface */

        System.out.println();

        System.out.println("************** Implemented interfaces");

        System.out.println("******** Mobile Application");
        System.out.println(Arrays.asList(mobileApplicationClass.getInterfaces()));

        System.out.println("******* HashSet");
        System.out.println(Arrays.asList(set.getClass().getInterfaces()));

        System.out.println();

        System.out.println("*************** Declaring and Enclosing Class");

        System.out.println("******* Employee");
        System.out.println("Declaring class: " + employeeClass.getDeclaringClass());
        System.out.println("Enclosing class: " + employeeClass.getEnclosingClass());

        System.out.println("******* HR");
        System.out.println("Declaring class: " + hrClass.getDeclaringClass());
        System.out.println("Enclosing class: " + hrClass.getEnclosingClass());

        System.out.println("******* MobileApplication");
        System.out.println("Declaring class: " + mobileApplicationClass.getDeclaringClass());
        System.out.println("Enclosing class: " + mobileApplicationClass.getEnclosingClass());

    }

}
