package $7genericCreatingClassesAndMethod.$4generictypeparameter;

public class Repository<T> {

    public T value;

    public Repository(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Repository contains: %s of type: %s", value, value.getClass());
    }

}
