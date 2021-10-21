package $1classesandobjects.$24inheritanceoffieldsandmethods;

public class TextBook extends Book {
    private String course = "Java 101";

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayType() {
        System.out.println("Type: Textbook");
    }
}
