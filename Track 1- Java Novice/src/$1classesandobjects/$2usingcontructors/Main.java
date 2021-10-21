package $1classesandobjects.$2usingcontructors;

public class Main {
    public static void main(String[] args) {
//        parameterized constructor invoking
        Student s1 = new Student(12, "Alice", 10.0);
        System.out.println("s1: " + s1);
        System.out.println(s1.id + " " + s1.name + " " + s1.gpa);
        System.out.println();

//        parameterized constructor invoking
        Student s2 = new Student();
        System.out.println("s1: " + s2);
        System.out.println(s2.id + " " + s2.name + " " + s2.gpa);
        System.out.println();
    }
}
