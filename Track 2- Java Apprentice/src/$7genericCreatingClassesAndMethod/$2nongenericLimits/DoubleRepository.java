package $7genericCreatingClassesAndMethod.$2nongenericLimits;

public class DoubleRepository {

    private Double value;

    public DoubleRepository(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Double Repository contains: %s", value);
    }

}
