package $1classesandobjects.$10accessingstaticvariables;

public class Cookie {
    private String id;
    private String userName;
    private String sessionKey;
    private int itemsInCart;

//    creating static variable
    public static String cookieType = "SESSION_COOKIE";

    public Cookie(String id, String userName, String sessionKey, int itemsInCart) {
        this.id = id;
        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsInCart = itemsInCart;
    }

    public String getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getSessionKey() {
        return sessionKey;
    }
    public int getItemsInCart() {
        return itemsInCart;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
    public void setItemsInCart(int itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

//    override toString()
    @Override
    public String toString() {
        return String.format("Cookie id: %s, userName: %s, sessionKey: %s, itemsInCart: %d", id, userName, sessionKey, itemsInCart);
    }

}
