package $4collectionsArraylists.$6workingwithnonparameterizedcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListPractise {
    /**
     *  List -
     *   -  Ordered collections of objects
     *
     *  ArrayList -
     *   -  Specific implementations of a list where arrays are used to stored
     *      elements.
     *
     *  Interface hierarchy -
     *   -  Iterable - Collection - List
     */

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        System.out.println("ArrayList class: " + arrayList.getClass());

        System.out.println();

        System.out.println("ArrayList instanceof List: " + (arrayList instanceof List));
        System.out.println("ArrayList instanceof Collection: " + (arrayList instanceof Collection));
        System.out.println("ArrayList instanceof Iterable: " + (arrayList instanceof Iterable));

    }

}
