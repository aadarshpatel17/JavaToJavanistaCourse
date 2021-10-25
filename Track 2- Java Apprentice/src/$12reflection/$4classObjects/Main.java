package $12reflection.$4classObjects;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Examining Class Objects for Different Data Types:
     *  -
     */

    public static void main(String[] args) {

        /**
         * The starting point for the use of Reflection is getting a handle to the class that a particular objects
         * belongs to. And that class is itself an object of a class 'Class' which the entry point from which we
         * can access whole host of Reflection APIs in Java.
         */

        Object object = new Object();

        /* Both of these print statement give access to class java.lang.Object */
        System.out.println("Object class via object: " + object.getClass());
        System.out.println("Object class via class: " + Object.class);
        System.out.println();

        /* Both of these print statement give access to class java.lang.Object */
        Integer integerObject = 123;
        System.out.println("Integer class via object: " + integerObject.getClass());
        System.out.println("Integer class via class: " + Integer.class);
        System.out.println();

        /* Both of these print statement give access to class java.lang.Object */
        Double doubleObject = 123.123;
        System.out.println("Double class via object: " + doubleObject.getClass());
        System.out.println("Double class via class: " + Double.class);
        System.out.println();

        ArrayList arrayList = new ArrayList();
        System.out.println("ArrayList class via object: " + arrayList.getClass());
        System.out.println("ArrayList class via class: " + ArrayList.class);
        System.out.println();

        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        NOTE: getClass() method doesn't return the type parameter--
        System.out.println("Integer ArrayList class via object: " + integerArrayList.getClass());
        System.out.println();

        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        /* These will also return concrete class that a particular object belong to. */
        System.out.println("Integer ArrayList class via object: " + integerList.getClass());
        System.out.println("Float ArrayList class via object: " + floatList.getClass());
        System.out.println();

    }

}
