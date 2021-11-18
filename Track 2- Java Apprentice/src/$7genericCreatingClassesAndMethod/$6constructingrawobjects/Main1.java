package $7genericCreatingClassesAndMethod.$6constructingrawobjects;

public class Main1 {

    /**
     * Constructing Raw Objects from Generic Classes
     *  -   Backward Compatibility: Generic classes can be instantiated using raw objects
     *  -   Repository<Object>: The Java compiler has lost all information of the type of
     *      data stored in the repository
     *  -
     */

    public static void main(String[] args) {

        Repository<String> stringRepository = new Repository<>("Welcome to Java");
        Repository rawStringRepository = stringRepository;

        System.out.println(rawStringRepository);

        Object stringObject = rawStringRepository.getValue();

        rawStringRepository.setValue("Hi Java");

        System.out.println(rawStringRepository);

        rawStringRepository.setValue(10);

        System.out.println("Contains the wrong type! " + rawStringRepository);

    }

}
