package $7genericCreatingClassesAndMethod.$10typeinference;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {

    /**
     * Identifying Type Inference for Parameterized Methods
     *  -
     */

    public static void main(String[] args) {

        MapHelper.displayElements("Key", "Value");
        MapHelper.displayElements(new Date(), new Date());

        /* data types can also be used */
        MapHelper.displayElements("Key", 123);
        MapHelper.displayElements(new Date(), 2342.22);

        /* After updates */
        MapHelper.displayElements(100, 200, 300);
        MapHelper.displayElements("Key", "Value", new Date(), new UUID(543, 98765));

    }

}
