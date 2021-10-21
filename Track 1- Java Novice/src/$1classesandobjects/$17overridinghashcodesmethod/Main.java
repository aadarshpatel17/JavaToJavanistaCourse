package $1classesandobjects.$17overridinghashcodesmethod;

public class Main {
    public static void main(String[] args) {

        Product phone = new Product(123, "iPhone", 500, "Mobiles and Accessories");
        Product phoneCopy = phone;
        Product anotherPhone = new Product(123, "iPhone", 500, "Mobiles and Accessories");

        System.out.println("phone.equals(anotherPhone): " + phone.equals(anotherPhone));    // true
        System.out.println("phone.equals(anotherPhone): " + phone.equals(phoneCopy));    // true
        System.out.println("phone.equals(anotherPhone): " + phoneCopy.equals(anotherPhone));    // true

        System.out.println();

        System.out.println("phone.hashCode(): " + phone.hashCode());
        System.out.println("phoneCopy.hashCode(): " + phoneCopy.hashCode());
        System.out.println("anotherPhone.hashCode(): " + anotherPhone.hashCode());

//        output
//        phone.hashCode(): 22307196
//        phoneCopy.hashCode(): 22307196
//        anotherPhone.hashCode(): 10568834

//        here the hash codes is different for anotherPhone but phone.equals(anotherPhone)
//        returns true which is voilation of hash code constract

//        So now we override .hashCode()


        System.out.println();
    }
}
