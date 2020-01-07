package javacollections.spring.demo.enums;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class EnumTest {

    @Test
    public void myEnumTestFest() {

        ShapesEnum red = ShapesEnum.RED;
        System.out.println(ShapesEnum.RED);
        System.out.println(red.label);
        System.out.println(ShapesEnum.valueOfLabel("red"));

        CachingShapesEnum cachedRed = CachingShapesEnum.RED;
        System.out.println(CachingShapesEnum.RED);
        System.out.println(cachedRed.label);
        System.out.println(CachingShapesEnum.valueOfLabel("red"));

        assertNotEquals(ShapesEnum.RED, CachingShapesEnum.RED);
        assertEquals(red.label, cachedRed.label);
        assertNotEquals(ShapesEnum.valueOfLabel("red"), CachingShapesEnum.valueOfLabel("red"));
    }
}