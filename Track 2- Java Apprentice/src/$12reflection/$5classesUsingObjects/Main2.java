package $12reflection.$5classesUsingObjects;

public class Main2 {

    /**
     * Identifying Classes Using Objects
     *  -
     */

    enum Weekdays {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday
    }

    public static void main(String[] args) {

        /**
         * The starting point for the use of Reflection is getting a handle to the class that a particular objects
         * belongs to. And that class is itself an object of a class 'Class' which the entry point from which we
         * can access whole host of Reflection APIs in Java.
         */

        Weekdays day = Weekdays.Friday;
        System.out.println("enum class via object: " + day.getClass());
        System.out.println("enum class via class: " + Weekdays.class);
        System.out.println();

        /* Primitive type variables we can not access object on them */
        int num = 12;
        boolean flag = true;
        float decimal = 12.3f;

//        System.out.println(num.getClass());
//        System.out.println(flag.getClass());
//        System.out.println(decimal.getClass());

        /* Even the built-in primitive types such as int, float, boolean, void are actually represented by classes.
        *  We can't instantiate those classes directly, but we can obtain handles to the class objects. */
        System.out.println(int.class);
        System.out.println(boolean.class);
        System.out.println(float.class);
        System.out.println(void.class);


    }

}
