package $7genericCreatingClassesAndMethod.$2nongenericLimits;

public class IntegerRepository {

    private Integer value;

    public IntegerRepository(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Integer Repository contains: %d", value);
    }

}
