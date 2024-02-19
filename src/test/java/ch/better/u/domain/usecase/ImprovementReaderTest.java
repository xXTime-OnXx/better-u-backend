package ch.better.u.domain.usecase;

import ch.better.u.domain.aggregate.Improvement;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImprovementReaderTest {

    @Test
    void readDataLineByLine() {
        List<Improvement> actualValue = ImprovementReader.readDataLineByLine();

        assertNotNull(actualValue);
        assertEquals(2, actualValue.size());
        assertEquals("01", actualValue.get(0).getId());
        assertEquals("brush teeth", actualValue.get(0).getName());
        assertEquals(6, actualValue.get(0).getPoints());
        assertTrue(actualValue.get(0).isDone());
    }
}