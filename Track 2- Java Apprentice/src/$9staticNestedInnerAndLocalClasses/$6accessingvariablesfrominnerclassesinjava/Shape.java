package $9staticNestedInnerAndLocalClasses.$6accessingvariablesfrominnerclassesinjava;

public class Shape {

    private final String shapeType;
    private final String color;
    private final String texture;

    public Shape(String shapeType, String color, String texture) {
        this.shapeType = shapeType;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return String.format("Shape: %s, Color: %s, Texture: %s", shapeType, color, texture);
    }

    public class Brush {

        public Brush() {

        }

        public void draw() {
            System.out.println("\n*** Drawing shape: " + Shape.this.shapeType);
            System.out.println("Color: " + Shape.this.color);
            System.out.println("Texture: " + Shape.this.texture);
        }

    }

}
