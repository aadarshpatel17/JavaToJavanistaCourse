package $7genericCreatingClassesAndMethod.$2nongenericLimits;

import java.util.Calendar;

public class Main {

    /**
     * Identifying Non-generic Code Reuse Limitations
     *  -
     */

    public static void main(String[] args) {

        IntegerRepository fifteen = new IntegerRepository(15);
        System.out.println(fifteen);

        IntegerRepository oneHundredOne = new IntegerRepository(101);
        System.out.println(oneHundredOne);

        DoubleRepository tenPointOne = new DoubleRepository(10.1);
        System.out.println(tenPointOne);

        StringRepository helloGenerics = new StringRepository("Hello Generics");
        System.out.println(helloGenerics);

        DateRepository today = new DateRepository(Calendar.getInstance().getTime());
        System.out.println(today);

    }

}
