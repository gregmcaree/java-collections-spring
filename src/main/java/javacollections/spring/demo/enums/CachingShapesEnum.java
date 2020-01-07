package javacollections.spring.demo.enums;

import java.util.HashMap;
import java.util.Map;

public enum CachingShapesEnum {
    RED("red"),
    BLUE("blue");

    private static final Map<String, CachingShapesEnum> BY_LABEL = new HashMap<>();

    public final String label;

    static {
        for (CachingShapesEnum e: values()) {
            BY_LABEL.put(e.label, e);
        }
    }

    CachingShapesEnum(String label) {
        this.label =label;
    }

    public static CachingShapesEnum valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }


}