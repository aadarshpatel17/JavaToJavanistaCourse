package $1classesandobjects.$18usinginstanceof;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book headFirstJava = new Book();
        String string = new String("A String");
        Date date = new Date("22/7/2021");
        Object obj = new Object();

//        true
        System.out.println("Is headFirstJava an instance of Book Class?: " + (headFirstJava instanceof Book));
        System.out.println("Is string an instance of String Class?: " + (string instanceof String));
        System.out.println("Is date an instance of Date Class?: " + (date instanceof Date));
        System.out.println("Is obj an instance of Object Class?: " + (obj instanceof Object));

        System.out.println();

//        false
        System.out.println("Is obj an instance of Book Class?: " + (obj instanceof Book));
        System.out.println("Is obj an instance of String Class?: " + (obj instanceof String));
        System.out.println("Is obj an instance of Date Class?: " + (obj instanceof Date));

        System.out.println();

//        true
        System.out.println("Is headFirstJava an instance of Object Class?: " + (headFirstJava instanceof Object));
        System.out.println("Is string an instance of Object Class?: " + (string instanceof Object));
        System.out.println("Is date an instance of Object Class?: " + (date instanceof Object));


//        error
//        System.out.println("Is headFirstJava an instance of String Class?: " + (headFirstJava instanceof String));
    }
}
