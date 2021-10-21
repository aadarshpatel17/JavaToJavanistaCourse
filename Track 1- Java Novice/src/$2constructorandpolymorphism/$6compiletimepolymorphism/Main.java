package $2constructorandpolymorphism.$6compiletimepolymorphism;

public class Main {
    public static void main(String[] args) {

        Measure measure = new Measure();

//        System.out.println("Perimeter of area: " + measure.perimeter(4));
//        System.out.println("Perimeter of rectangle: " + measure.perimeter(4,3));
//        System.out.println("Perimeter of triangle: " + measure.perimeter(4,3, 2));

//        System.out.println("Area of rectangle: " + measure.area(4,3));
//        System.out.println();
//        System.out.println("Area of rectangle: " + measure.area(4f,3f));
//        System.out.println();
//        System.out.println("Area of rectangle: " + measure.area(4.2,3.2));
//        System.out.println();
//        System.out.println("Area of rectangle: " + measure.area(4.2f,3));
//        System.out.println();
//        System.out.println("Area of rectangle: " + measure.area(4,3.2f));
//        System.out.println();


//        type promotion code
        System.out.println("*****Type promotion of input arguments ***");

        System.out.println("Area of rectangle: " + measure.area(3, 3.3f));
        System.out.println();
//        output
//        area(float a, float b)
//        Area of rectangle: 9.9

        System.out.println("Area of rectangle: " + measure.area(3, 3.3));
        System.out.println();
//        output
//        area(double a, double b)
//        Area of rectangle: 9.8999999999999

//        NOTE: Type Promotion is possible but vice versa is not possible, which
//        is known as Coercion.


    }
}
