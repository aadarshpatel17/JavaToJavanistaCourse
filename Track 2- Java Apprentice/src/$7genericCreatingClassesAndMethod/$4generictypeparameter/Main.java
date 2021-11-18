package $7genericCreatingClassesAndMethod.$4generictypeparameter;

import java.util.Calendar;
import java.util.Date;

public class Main {

    /**
     * Implementing Classes with Generic Type Parameters
     *  -   Type Parameter: A placeholder for the different types of data that the Repository can work with.
     *  -
     */

    public static void main(String[] args) {

        Repository<Integer> fifteen = new Repository<>(15);
        System.out.println(fifteen);

        Repository<Integer> oneHundredOne = new Repository<>(101);
        System.out.println(oneHundredOne);

        Repository<Double> tenPointOne = new Repository<>(10.1);
        System.out.println(tenPointOne);

        Repository<String> helloGenerics = new Repository<>("Hello Generics");
        System.out.println(helloGenerics);

        Repository<Date> today = new Repository<>(Calendar.getInstance().getTime());
        System.out.println(today);

    }

}
