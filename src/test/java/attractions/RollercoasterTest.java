package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorOver13And146cmIsAllowed() {
        Visitor visitor = new Visitor(13, 146, 20);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorUnder146cmIsNotAllowed() {
        Visitor visitor = new Visitor(13, 145, 20);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorUnder13IsNotAllowed() {
        Visitor visitor = new Visitor(12, 146, 20);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }
}
