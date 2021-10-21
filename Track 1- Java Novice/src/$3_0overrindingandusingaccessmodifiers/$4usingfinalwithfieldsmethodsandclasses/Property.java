package $3_0overrindingandusingaccessmodifiers.$4usingfinalwithfieldsmethodsandclasses;

public class Property {

    private final String propertyType;
    private final long id = Math.round(Math.random() * 100000);
    private final String projectName;
    private final int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

//    public void setPropertyType(String propertyType) {
//        this.propertyType = propertyType;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }
//
//    public void setPropertySize(int propertySize) {
//        this.propertySize = propertySize;
//    }

    @Override
    public String toString() {
        return String.format("Property {type=%s, id=%d, projectName=%s, propertySize=%s}",
                propertyType, id, projectName, propertySize);
    }
}
