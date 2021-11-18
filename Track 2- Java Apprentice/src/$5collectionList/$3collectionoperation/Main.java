package $5collectionList.$3collectionoperation;

import java.util.ArrayList;

public class Main {

    /**
     * Performing Collection Operations
     *  -   Generic List can only be instantiated where the type arguments are objects, not with primitive types.
     *  -   null will be accepted as valid input.
     *  -
     */

    public static void main(String[] args) {

//        ArrayList<int> intList = new ArrayList<int>();

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(100);
        intList.add(200);
        intList.add(300);
        intList.add(400);

        System.out.println("Integer list: " + intList);

        intList.add(null);

        System.out.println("Integer list (after adding null): " + intList);

    }

}
