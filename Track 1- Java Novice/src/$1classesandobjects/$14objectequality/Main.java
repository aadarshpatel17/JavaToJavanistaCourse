package $1classesandobjects.$14objectequality;

public class Main {
    public static void main(String[] args) {

        Product phone = new Product(123, "iPhone", 500, "Mobiles and Accessories");
        Product tv = new Product(56, "Samsung", 1500, "Electronics");
        Product shoes = new Product(23, "Nike", 300, "Footwear");
        Product watch = new Product(5, "Rolex", 800, "Mobiles and Accessories");

        System.out.println(phone);
        System.out.println(tv);
        System.out.println(shoes);
        System.out.println(watch);

        System.out.println();

//        == : checks whether object present at same location on the java heap...
        System.out.println("phone == tv : " + (phone == tv));   // false
        System.out.println("shoes == watch : " + (shoes == watch));
        System.out.println("watch == tv : " + (watch == tv));
        System.out.println("shoes == phone : " + (shoes == phone));

        System.out.println();

//        shallow copies: other object reference which points to the same
//        underlying object
        Product anotherPhone = phone;
        Product anotherTv = tv;

        System.out.println("phone == anotherPhone : " + (phone == anotherPhone));   //true
        System.out.println("tv == anotherTv : " + (anotherTv == tv));

        System.out.println();

//       .equals : checks whether object present at same location on the java heap...
        System.out.println("phone.equals(tv) : " + phone.equals(tv));   //false
        System.out.println("shoes.equals(watch) : " + shoes.equals(watch));
        System.out.println("watch.equals(tv) : " + watch.equals(tv));
        System.out.println("shoes.equals(phone) : " + shoes.equals(phone));

        System.out.println();

        System.out.println("phone.equals(anotherPhone): " + phone.equals(anotherPhone));    // true
        System.out.println("tv.equals(anotherTv): " + tv.equals(anotherTv));

    }
}
