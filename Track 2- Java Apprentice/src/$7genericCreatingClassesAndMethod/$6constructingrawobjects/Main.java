package $7genericCreatingClassesAndMethod.$6constructingrawobjects;

public class Main {

    /**
     * Constructing Raw Objects from Generic Classes
     *  -   Backward Compatibility: Generic classes can be instantiated using raw objects
     *  -   Repository<Object>: The Java compiler has lost all information of the type of
     *      data stored in the repository
     *  -
     */

    public static void main(String[] args) {

        /* NOTE: Using a generic class definition without specifying a type value (Raw use of generic class)
            is valid in Java.
            This is code that Java supports for the purpose of backward compatibility. */
        Repository rawStringRepository = new Repository("Hello Java");
        System.out.println(rawStringRepository);

        Object stringObject = rawStringRepository.getValue();

        Repository rawFloatRepository = new Repository(12.5f);
        System.out.println(rawFloatRepository);

        Object floatObject = rawFloatRepository.getValue();

        Repository rawBooleanRepository = new Repository(false);
        System.out.println(rawBooleanRepository);

        Object booleanObject = rawBooleanRepository.getValue();

    }

}
