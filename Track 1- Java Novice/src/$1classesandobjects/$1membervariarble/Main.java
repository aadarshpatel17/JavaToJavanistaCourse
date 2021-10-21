package $1classesandobjects.$1membervariarble;

public class Main {
    public static void main(String[] args) {

        // NOTE: The string representations (toString) does not automatically
        // know about hte variables that you have declared in the class

        Student s1 = new Student();
        System.out.println("s1: " + s1);
        System.out.println(s1.id + " " + s1.name + " " + s1.gpa);

        System.out.println();

        Student s2 = new Student();
        System.out.println("s2: " + s2);
        // modifications
        s2.id = 123123;
        s2.name = "Bob";
        s2.gpa = 3.0;
        System.out.println(s2.id + " " + s2.name + " " + s2.gpa);

//        comparison
        System.out.println(s1.equals(s2));

    }
}
