package javacollections.spring.demo.enums;

public enum ShapesEnum {
    RED("red"),
    BLUE("blue");

    public final String label;

    public static String getLabel(String label) {
        return label;
    }

    public static ShapesEnum valueOfLabel(String label) {
        for (ShapesEnum shape: values()) {
            if (shape.label.equals(label)) {
                return shape;
            }
        }
        return null;
    }

    ShapesEnum(String label) {
     this.label = label;
    }
}