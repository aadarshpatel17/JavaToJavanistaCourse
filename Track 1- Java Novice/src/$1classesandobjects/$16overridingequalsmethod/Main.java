package $1classesandobjects.$16overridingequalsmethod;

public class Main {
    public static void main(String[] args) {

//        After overriding .equals() methods
//        Now if the object has different memory locations but have same values
//        then it will evaluate to TRUE

        Product phone = new Product(123, "iPhone", 500, "Mobiles and Accessories");
        Product anotherPhone = new Product(123, "iPhone", 500, "Mobiles and Accessories");

        System.out.println("phone.equals(anotherPhone): " + phone);
        System.out.println("phone.equals(anotherPhone): " + anotherPhone);

        System.out.println();

        System.out.println("phone == anotherPhone: " + (phone == anotherPhone));    // false
        System.out.println("phone.equals(anotherPhone): " + phone.equals(anotherPhone));    // true

        System.out.println();
    }
}
