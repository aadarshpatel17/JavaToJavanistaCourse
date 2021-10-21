package $9staticNestedInnerAndLocalClasses.$6accessingvariablesfrominnerclassesinjava;

public class Shape2 {

    private final String shapeType;

    public Shape2(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public String toString() {
        return String.format("Shape: %s, Color: %s, Texture: %s", shapeType);
    }

    public class Brush {

        private final String color;
        private final String texture;

        public Brush(String color, String texture) {
            this.color = color;
            this.texture = texture;
        }

        public void draw() {
            System.out.println("\n*** Drawing shape: " + Shape2.this.shapeType);
            System.out.println("Color: " + this.color);
            System.out.println("Texture: " + this.texture);
        }

    }

}
