package $1classesandobjects.$24inheritanceoffieldsandmethods;

public class NonFictionBook extends Book {
    private String subject = "Evolution/History";

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayType() {
        System.out.println("Type: Non-fiction");
    }
}
