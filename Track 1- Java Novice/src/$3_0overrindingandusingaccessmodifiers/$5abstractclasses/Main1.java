package $3_0overrindingandusingaccessmodifiers.$5abstractclasses;

public class Main1 {
    public static void main(String[] args) {

        OnePlus onePlus = new OnePlus(499, true);
        IPhone iPhone = new IPhone(1200, true);

        System.out.println("One Plus: " + onePlus);
        System.out.println("iPhone: " + iPhone);

        System.out.println("One Plus price: " + onePlus.computeTotalPrice());
        System.out.println("iPhone price: " + iPhone.computeTotalPrice());

        System.out.println();

    }
}