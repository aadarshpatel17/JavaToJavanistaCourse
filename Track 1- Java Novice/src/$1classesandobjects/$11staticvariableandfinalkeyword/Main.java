package $1classesandobjects.$11staticvariableandfinalkeyword;

public class Main {
    public static void main(String[] args) {

//        Cookie first = new Cookie("abc1", "Alice", "alic123", 2);
//        System.out.println("Cookie-Type: (first) " + first.cookieType);
//
//        System.out.println();
//
//        Cookie sec = new Cookie("cba12", "Bob", "bob123", 10);
//        System.out.println("Cookie-Type: (sec) " + sec.cookieType);
//
//        System.out.println();
//
//        Cookie third = new Cookie("bca123", "James", "jame2123", 4);
//        System.out.println("Cookie-Type: (third) " + third.cookieType);
//
//        System.out.println();

//        correct way to access static fields
//        Cookie.cookieType = "LOGGED_IN_USER_COOKIE";
//        System.out.println("Updated Static variable Cookie-Type: " + Cookie.cookieType);
//
//        System.out.println();
//
//        System.out.println("Cookie-Type: (first) " + first.cookieType);
//        System.out.println("Cookie-Type: (sec) " + sec.cookieType);
//        System.out.println("Cookie-Type: (third) " + third.cookieType);


////        after setting getter and setter
//        Cookie first = new Cookie("abc1", "Alice", "alic123", 2);
//        System.out.println("Cookie-Type: (first) " + first.getCookieType());
//
//        Cookie sec = new Cookie("cba12", "Bob", "bob123", 10);
//        System.out.println("Cookie-Type: (sec) " + sec.getCookieType());
//
//        Cookie third = new Cookie("bca123", "James", "jame2123", 4);
//        System.out.println("Cookie-Type: (third) " + third.getCookieType());
//
//        System.out.println();
//
//        System.out.println("AFTER UPDATING STATIC VARIABLE");
//        Cookie.setCookieType("LOGGED_IN_USER");
////        first.setCookieType("LOGGED_IN_USER");
//
//        System.out.println();
//
//        System.out.println("Cookie-Type: (first) " + first.getCookieType());
//        System.out.println("Cookie-Type: (sec) " + sec.getCookieType());
//        System.out.println("Cookie-Type: (third) " + third.getCookieType());



//        correct way to access static variables
        System.out.println("Initial Value Cookie-Type: " + Cookie.getCookieType());

        Cookie.setCookieType("LOGGED_IN_USER");

        System.out.println("Updated Value Cookie-Type: " + Cookie.getCookieType());

    }
}
