package $7genericCreatingClassesAndMethod.$3usingrawobjects;

import java.util.Calendar;
import java.util.Date;

public class Main {

    /**
     * Using Raw Objects to Store Data: The Limitations
     *  -
     */

    public static void main(String[] args) {

        Repository fifteen = new Repository(15);
        System.out.println(fifteen);

        Repository oneHundredOne = new Repository(101);
        System.out.println(oneHundredOne);

        Repository tenPointOne = new Repository(10.1);
        System.out.println(tenPointOne);

        Repository helloGenerics = new Repository("Hello Generics");
        System.out.println(helloGenerics);

        Repository today = new Repository(Calendar.getInstance().getTime());
        System.out.println(today);

        System.out.println("**** Accessing values with the right type");
        /* NOTE: The Repository.getValue() return Object so, we need to cast it to right type */
        Integer intValue = (Integer) fifteen.getValue();
        Double doubleValue = (Double) tenPointOne.getValue();
        String strValue = (String) helloGenerics.getValue();
        Date dateValue = (Date) today.getValue();

    }

}
