package $7genericCreatingClassesAndMethod.$2nongenericLimits;

public class StringRepository {

    private String value;

    public StringRepository(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("String Repository contains: %s", value);
    }

}
