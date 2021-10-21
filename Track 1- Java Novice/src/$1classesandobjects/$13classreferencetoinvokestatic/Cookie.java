package $1classesandobjects.$13classreferencetoinvokestatic;

public class Cookie {
    private String id;
    private String userName;
    private String sessionKey;
    private int itemsInCart;

    private static String cookieType = "SESSION_COOKIE";

    public Cookie(String id, String userName, String sessionKey, int itemsInCart) {
        this.id = id;
        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsInCart = itemsInCart;
    }

//    instance methods
    public void instanceOne() {
        System.out.println("instanceOne");

//        this will work
        staticOne();
    }
    public void instanceTwo() {
        System.out.println("instanceTwo");
    }
    public void instanceThree() {
        System.out.println("instanceThree");
    }

//    static methods
    public static void staticOne() {
        System.out.println("staticOne");

//        while this will produce error
//        instanceOne();

    }
    public static void staticTwo() {
        System.out.println("staticTwo");
    }
    public static void staticThree() {
        System.out.println("staticThree");
    }


    //    creating getter and setter for Cookie
    public static String getCookieType() {
        return cookieType;
    }

    //    this keyword cannot be referenced from a static context
    public static void setCookieType(String cookieType) {
        Cookie.cookieType = cookieType;
    }


//    override toString()
    @Override
    public String toString() {
        return String.format("Cookie id: %s, userName: %s, sessionKey: %s, itemsInCart: %d", id, userName, sessionKey, itemsInCart);
    }

    public static void main(String[] args) {

//        System.out.println("Can set static setCookieType(): " + cookieType);
//
//        setCookieType("USER_COOKIE");
//
//        System.out.println("Can access static getCookieType(): " + getCookieType());


//        NOTE:
//            non static fields and methods can not access from a static context
//            methods not marked as static called instance methods
//            static methods can called from both instance and static methods
//            static methods can directly access by class name

//        instance methods can only invoked with the help of receiver object
//        reference like c here
//        instance methods can not called from static content without object reference

        System.out.println("Instance Methods Invoked...");
        Cookie c = new Cookie("1", "Alice", "alice123", 10);
        c.instanceOne();
        c.instanceTwo();
        c.instanceThree();

        System.out.println();
        System.out.println("Static Methods Invoked...");
//        this will work
        staticOne();
        staticTwo();
        staticThree();

//        while this will produce error
//        instanceOne();
//        instanceTwo();
//        instanceThree();

        System.out.println();



    }
}
