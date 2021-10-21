package $1classesandobjects.$15understandinghashcodecontract;

public class Main {
    public static void main(String[] args) {

//        Product phone = new Product(123, "iPhone", 500, "Mobiles and Accessories");
//        Product anotherPhone = new Product(123, "iPhone", 500, "Mobiles and Accessories");
//
////        contains same values but different memory locations
//        System.out.println("phone == anotherPhone : " + (phone == anotherPhone));   //false
//        System.out.println("phone.equals(anotherPhone): " + phone.equals(anotherPhone));    // false
//
//        System.out.println();


//        understanding hashCode contract :
//               If tow objects evaluate to true when compared using .equals, then
//               their hash codes must be equal as well
//        phone.equals(phoneCopy) is true so hashcodes are equal
        Product phone = new Product(123, "iPhone", 500, "Mobiles and Accessories");
        Product anotherPhone = new Product(123, "iPhone", 500, "Mobiles and Accessories");

        Product phoneCopy = phone;
        Product anotherPhoneCopy = anotherPhone;

        System.out.println("phone.equals(anotherPhone): " + phone.hashCode());
        System.out.println("phone.equals(anotherPhone): " + phoneCopy.hashCode());

        System.out.println();

        System.out.println("phone.equals(anotherPhone): " + anotherPhone.hashCode());
        System.out.println("phone.equals(anotherPhone): " + anotherPhoneCopy.hashCode());

        System.out.println();



    }
}
