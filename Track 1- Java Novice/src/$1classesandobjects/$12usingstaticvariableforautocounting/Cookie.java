package $1classesandobjects.$12usingstaticvariableforautocounting;

import java.util.Random;

public class Cookie {
    private String id;
    private String userName;
    private String sessionKey;
    private int itemsInCart;

//    private static int cookieCount = 0;
//
//    public Cookie(String id, String userName, String sessionKey, int itemsInCart) {
//        this.id = id;
//        this.userName = userName;
//        this.sessionKey = sessionKey;
//        this.itemsInCart = itemsInCart;
//
//        cookieCount++;
//    }
//
//    public static int getCookieCount() {
//        return cookieCount;
//    }


//    private static int uniqueIdGenerator = 10001;
    private static final Random uniqueIdGenerator = new Random();

    public Cookie(String userName, String sessionKey, int itemsInCart) {
//        this.id = "CookieId- " + uniqueIdGenerator++;
        this.id = "CookieId- " + uniqueIdGenerator.nextInt();

        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsInCart = itemsInCart;
    }

//    override toString()
    @Override
    public String toString() {
        return String.format("Cookie id: %s, userName: %s, sessionKey: %s, itemsInCart: %d", id, userName, sessionKey, itemsInCart);
    }
}
