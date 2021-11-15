package $14reflectionAnnotationsGenericArrays.$6limitations;

public class ContainerWrapper<T> {
    private Container<T> container;

    public ContainerWrapper (Container<T> container) {
        this.container = container;
    }

    public Container<T> getContainer() {
        return container;
    }

    public void setContainer(Container<T> container) {
        this.container = container;
    }
}
