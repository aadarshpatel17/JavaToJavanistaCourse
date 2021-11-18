package $7genericCreatingClassesAndMethod.$3usingrawobjects;

import java.util.Date;

public class Repository {

    private Object value;

    public Repository(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Repository contains: %s of type: %s", value, value.getClass());
    }

}
