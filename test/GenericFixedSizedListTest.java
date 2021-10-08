import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericFixedSizedListTest {

    @Test
    public void testAddElement5() {
        // Arrange
        GenericFixedSizedList<Apple> applesBox = new GenericFixedSizedList<>();
        // Act
        applesBox.addElement(null);
        applesBox.addElement(null);
        applesBox.addElement(null);
        applesBox.addElement(null);
        applesBox.addElement(null);
        // Assert
        assertEquals(5, applesBox.size());
    }

    @Test
    public void testAddElement6() {
        // Arrange
        GenericFixedSizedList<String> jokesContainer = new GenericFixedSizedList<>();
        // Act
        jokesContainer.addElement("Joke1");
        jokesContainer.addElement("Joke1");
        jokesContainer.addElement("Joke1");
        jokesContainer.addElement("Joke1");
        jokesContainer.addElement("Joke1");
        jokesContainer.addElement("Joke6");
        // Assert
        assertEquals(5, jokesContainer.size());
    }

    @Test
    public void testRemoveElement() {
        // Arrange
        GenericFixedSizedList<Apple> apples = new GenericFixedSizedList<>();
        apples.addElement(null);
        // Act
        apples.removeElement(null);
        // Assert
        assertEquals(0, apples.size());
    }

    @Test
    public void testGetElement() {
        // Arrange + ACT
        GenericFixedSizedList<Car> cars = new GenericFixedSizedList<>();
        cars.addElement(new Car("VW", 17));
        cars.addElement(new Car("BMW", 11));
        cars.addElement(null);
        // Assert
        assertEquals("BMW", cars.getElement(1).getBrand());
    }

    @Test
    public void testSize() {
        // Arrange + Act
        GenericFixedSizedList<String> jokesContainer = new GenericFixedSizedList<>();
        // Assert
        assertEquals(0, jokesContainer.size());
    }

    @Test
    public void testContainsElement() {
        // Arrange
        GenericFixedSizedList<Animal> animals = new GenericFixedSizedList<>();
        // Act
        animals.addElement(null);
        // Assert
        assertEquals(true, animals.containsElement(null));
    }
}
