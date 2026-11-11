package id.ac.polban.pbo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {

    @Test
    void area_menggunakanReferenceShape() {
        // Arrange
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 4);

        // Act
        double circleArea = circle.area();
        double rectangleArea = rectangle.area();

        // Assert
        assertEquals(Math.PI * 49, circleArea, 0.001);
        assertEquals(20, rectangleArea, 0.001);
    }
}
