package $3_0overrindingandusingaccessmodifiers.$3identifyingmethodhiding;

public class Property {

    private String propertyType = "unknown";

    private final String projectName;
    private final int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {
        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }


    public static String getPropertyType() {
        return "unknown";
    }


    @Override
    public String toString() {
        return String.format("Property {type=%s, projectName=%s, propertySize=%s}", propertyType, projectName, propertySize);
    }

}
