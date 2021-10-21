package $1classesandobjects.$23upcastinganddowncasting;

public class Main {
    public static void main(String[] args) {

        NonFictionBook sapiens = new NonFictionBook();
        Book book = new NonFictionBook();
        Object object = new NonFictionBook();

        sapiens.checkOutBook();
        sapiens.displaySubject();

        book.checkOutBook();
        ((NonFictionBook) book).displaySubject();   //down-casting

        ((NonFictionBook) object).checkOutBook();   //down-casting
        ((NonFictionBook) object).displaySubject();   //down-casting

        System.out.println();

    }
}
