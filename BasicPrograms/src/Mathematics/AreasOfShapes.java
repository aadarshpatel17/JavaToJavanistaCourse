package Mathematics;

import java.util.Scanner;

public class AreasOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        System.out.println("1 for Triangle");
        System.out.println("2 for Square");
        System.out.println("3 for Circle");
        System.out.println("4 for Rectangle");
        System.out.println("5 for Parallelogram");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter sides of triangle");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                float s = (float) (a + b + c)/2;
                float area = (float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                System.out.format("Area of Triangle with sides %d, %d, %d is %f\n", a, b, c, area);
                break;
            }

            case 2: {
                System.out.println("Enter sides of square");
                int a = sc.nextInt();
                float area =(float) a * a;
                System.out.println("Area of Square is " + area);

            }

            case 3: {
                System.out.println("Enter of Radius of Circle");
                int radius = sc.nextInt();
                float area = (float) 3.14159 * radius * radius;
                System.out.format("Area of Circle with radius %f is %f");
                break;
            }

            case 4: {
                float len, breadth, area;
                System.out.println("Enter length and breadth of rectangle");
                len = sc.nextInt();
//                area = (float) len * breadth;
            }

        }

    }
}
