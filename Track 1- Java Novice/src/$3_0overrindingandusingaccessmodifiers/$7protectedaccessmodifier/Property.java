package $3_0overrindingandusingaccessmodifiers.$7protectedaccessmodifier;

public class Property {

    protected String propertyType;

    private long id;
    private String projectName;
    private int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {
        this.id = Math.round(Math.random() * 10000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

    protected long getId() {
        return id;
    }

    protected int getPropertySize() {
        return propertySize;
    }

    protected String getProjectName() {
        return projectName;
    }

    protected String getPropertyType() {
        return propertyType;
    }


    protected String getFormattedString() {
        return String.format("\nProperty {propertyType: %s, id: %d, projectName: %s, propertySize: %s}", propertyType, id, projectName, propertySize);
    }

    @Override
    public String toString() {
        return getFormattedString();
    }

}
