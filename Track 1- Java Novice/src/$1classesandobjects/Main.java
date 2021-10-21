package $1classesandobjects;

public class Main {
    public static void main(String[] args) {

//        String someString = new String("Some String");
//        System.out.println(someString);
//
//        String anotherString = new String("Another String");
//        System.out.println(anotherString);
//
//        Date someDate = new Date();
//        System.out.println(someDate);
//
//        Random someRandom = new Random();
//        System.out.println(someRandom);
//
//        Object someObject = new Object();
//        System.out.println(someObject);



//        default no-arguement constructor invoked here...

        Student alice = new Student();
        System.out.println(alice);
        System.out.println(alice.toString());
        System.out.println(alice.getClass());

        Student bob = new Student();
        System.out.println(bob);
        System.out.println(bob.toString());
        System.out.println(bob.getClass());

        System.out.println(alice.equals(bob));  //false





        System.out.println();
    }
}
