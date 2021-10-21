package $4workingwithinterfacesandclassloaders.$5identifyingclassloaders;

import java.net.http.HttpClient;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Every class object has a reference to the class loader that denfined it,
//          using Employee class loader

        System.out.println("-- System or Application class loader");
        System.out.println("Employee class loader: " + Employee.class.getClassLoader());
        System.out.println();
//        Output:   Employee class loader: sun.misc.Launcher$AppClassLoader@644d46
//        We are making use of Application class loader here which is at lowest level
//          of hierarchy of class loader
//        User defined classes are loaded by ApplicationClassLoaders.
//        Above applicationClassLoaders comes platformClassLoaders and above this comes
//        BootstrapClassLoaders


        System.out.println("-- Platefrom class loader");
        System.out.println("ResultSet class loader: " + ResultSet.class.getClassLoader());
        System.out.println("HttpClient class loader: " + HttpClient.class.getClassLoader());
        System.out.println();

        System.out.println("-- Bootstarp class loader");
        System.out.println("Math class loader: " + Math.class.getClassLoader());
        System.out.println("ArrayList class loader: " + ArrayList.class.getClassLoader());
        System.out.println();

    }

}
