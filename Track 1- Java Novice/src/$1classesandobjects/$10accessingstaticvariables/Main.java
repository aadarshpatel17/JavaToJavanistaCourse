package $1classesandobjects.$10accessingstaticvariables;

public class Main {
    public static void main(String[] args) {

//        Cookie first = new Cookie("abc1", "Alice", "alic123", 2);
////        toString() implicitily called here
//        System.out.println("first: " + first);
//        System.out.println("first: " + first.toString());
////        output will be same for below 2 lines
////        first: Cookie id: abc1, userName: Alice, sessionKey: alic123, itemsInCart: 2
////        first: Cookie id: abc1, userName: Alice, sessionKey: alic123, itemsInCart: 2
//
//        System.out.println();
//
//        Cookie sec = new Cookie("cba12", "Bob", "bob123", 10);
//        System.out.println("sec: " + sec.toString());
//
//        System.out.println();
//
//        Cookie third = new Cookie("bca123", "James", "jame2123", 4);
//        System.out.println("third: " + third);
//        System.out.println("third: " + third.toString());



//        NOTE:
//            It is not a good practise to access static variables and methods using
//            object reference always try to use class reference
//        object reference = first, second, third  =  System.out.println("Session-Type: " + first.cookieType);
//        class reference = Cookie = System.out.println("Cookie-Type: " + Cookie.cookieType);

        Cookie first = new Cookie("abc1", "Alice", "alic123", 2);
        System.out.println(first);
        System.out.println("Cookie-Type: (first) " + first.cookieType);

        System.out.println();

        Cookie sec = new Cookie("cba12", "Bob", "bob123", 10);
        System.out.println(sec);
        System.out.println("Cookie-Type: (sec) " + sec.cookieType);

        System.out.println();

        Cookie third = new Cookie("bca123", "James", "jame2123", 4);
        System.out.println(third);
        System.out.println("Cookie-Type: (third) " + third.cookieType);

//        reassigning value to static varibale
//        static variable is share by all the objects of the particular class
//        so modification will happen at all places
        Cookie.cookieType = "LOGGED_IN_USER_COOKIE";
        System.out.println();
        System.out.println("Cookie-Type (first): " + first.cookieType);
        System.out.println("Cookie-Type (sec): " + sec.cookieType);
        System.out.println("Cookie-Type (third): " + third.cookieType);

        System.out.println();

    }
}
