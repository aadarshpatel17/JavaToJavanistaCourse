package $1classesandobjects.$2usingcontructors;

public class Student {
    public int id;
    public String name;
    public double gpa;

//    default constructor :-
//        must have same name as class
//        must have no return type

        public Student() {
                id = 123;
                name = "Alice";
                gpa = 12.2;
        }


//    parameterized constructor
//        public Student(int inputId, String inputName, double inputGpa) {
//                id = inputId;
//                name = inputName;
//                gpa = inputGpa;
//        }

        public Student(int id, String name, double gpa) {
//                used this as a receiver while accessing the fields name
//                this represents current objects here Student
                this.id = id;
                this.name = name;
                this.gpa = gpa;

                System.out.println("this: " + this);
//                this: classesandobjects.usingcontrustors.Student@154617c
        }
}
