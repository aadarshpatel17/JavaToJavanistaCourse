package $6collectionSetsAndMaps.$5comparableandcomparator;

import java.util.Objects;

public class ProductWithoutComparable {

    private String name;
    private String category;

    public ProductWithoutComparable(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("\n{name: %s, category: %s}", name, category);
    }

    @Override
    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!(other instanceof ProductWithoutComparable))
            return false;

        ProductWithoutComparable otherProduct = (ProductWithoutComparable) other;
        if(otherProduct.name.equals(this.name) && otherProduct.category.equals(this.category))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

}
