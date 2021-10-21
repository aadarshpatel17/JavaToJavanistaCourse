package $3_0overrindingandusingaccessmodifiers.$6privateaccessmodifier;

public class Property {

    public String propertyType;

    private long id;
    private String projectName;
    private int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {
        this.id = Math.round(Math.random() * 10000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

    public int getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(int propertySize) {
        this.propertySize = propertySize;
    }

    private String getFormattedString() {
        return String.format("\nProperty {propertyType: %s, id: %d, projectName: %s, propertySize: %s}", propertyType, id, projectName, propertySize);
    }

    @Override
    public String toString() {
        return getFormattedString();
    }

}
