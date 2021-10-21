package $1classesandobjects.$24inheritanceoffieldsandmethods;

public class FictionBook extends Book {
    private String plot = "Boy stranded in a boad with a tiger";

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public void displayType() {
        System.out.println("Type: Fiction");
    }
}
