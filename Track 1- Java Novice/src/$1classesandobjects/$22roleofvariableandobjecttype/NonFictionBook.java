package $1classesandobjects.$22roleofvariableandobjecttype;

public class NonFictionBook extends Book {
    private String subject = "Evolution/History";

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displaySubject() {
        System.out.println("Type: Non-fiction");
    }
}
