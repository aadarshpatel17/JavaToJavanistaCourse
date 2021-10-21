package $1classesandobjects.$3usingprivatefieldsandmethods;

public class Main {
        public static void main(String[] args) {
//        Student s1 = new Student(12, "Alice", 10.0);
//        System.out.println("s1: " + s1);
//        s1.printStudentInfo();
//
//        Student s2 = new Student(11, "Bob", 12.0);
//        System.out.println("s1: " + s2);
//        s2.printStudentInfo();

//        invoking getter and setter methods
            Student alice = new Student(1, "Alice", 12.0);
            System.out.println(alice.getId() + " " + alice.getName() + " " + alice.getGpa());

            alice.setId(11);
            alice.setGpa(45);

            System.out.println(alice.getId() + " " + alice.getName() + " " + alice.getGpa());

    }
}
