package $14reflectionAnnotationsGenericArrays.$6limitations;

public class ContainerWrapper2<T> {

    /**
     * One possible solution for this is, we can explicitly specify the type of the type parameter like String below.
     *  Which is not a good practise in JAVA
     */

    private Container<String> container;

    public ContainerWrapper2(Container<String> container) {
        this.container = container;
    }

    public Container<String> getContainer() {
        return container;
    }

    public void setContainer(Container<String> container) {
        this.container = container;
    }
}
