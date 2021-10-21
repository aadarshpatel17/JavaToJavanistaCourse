package $2constructorandpolymorphism.$6compiletimepolymorphism;

public class Measure {

//    public int perimeter(int a) {
//        return 4 * a;
//    }
//
//    public int perimeter(int a, int b) {
//        return (2 * (a + b));
//    }
//
//    public double perimeter(int a, int b, int c) {
//        return (a + b + c);
//    }
//
//    public int area(int a, int b) {
//        System.out.println("int area(int a, int b)");
//        return (a * b);
//    }
//
//    public float area(float a, float b) {
//        System.out.println("float area(float a, float b)");
//        return (a * b);
//    }
//
//    public double area(double a, double b) {
//        System.out.println("double area(double a, double b)");
//        return (a * b);
//    }
//
//    public float area(float a, int b) {
//        System.out.println("float area(float a, int b)");
//        return (a * b);
//    }
//
//    public float area(int a, float b) {
//        System.out.println("float area(int a, float b)");
//        return (a * b);
//    }


//    type-promotion of variables
    public int area(int a, int b) {
        System.out.println("area(int a, int b)");
        return (a * b);
    }

    public float area(float a, float b) {
        System.out.println("area(float a, float b)");
        return (a * b);
    }

    public double area(double a, double b) {
        System.out.println("area(double a, double b)");
        return (a * b);
    }


}
