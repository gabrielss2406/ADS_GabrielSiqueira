package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The LogManagerTest class contains unit tests for the LogManager class.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
class LogManagerTest {

    /**
     * Tests that given two instances retrieved using getInstance,
     * they should be the same reference.
     */
    @Test
    void givenTwoInstances_whenGetInstance_thenSameReference() {
        // Arrange
        LogManager instance1 = LogManager.getInstance();
        assertNotNull(instance1);

        // Act
        LogManager instance2 = LogManager.getInstance();
        assertNotNull(instance2);

        // Assert
        assertEquals(instance1, instance2);
    }
}
