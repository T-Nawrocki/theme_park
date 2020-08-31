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

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargesStandardPriceUpTo200cm() {
        Visitor visitor = new Visitor(25, 200, 20);
        assertEquals(8.4, rollerCoaster.priceFor(visitor));
    }

    @Test
    public void chargesDoubleOver200cm() {
        Visitor visitor = new Visitor(25, 201, 20);
        assertEquals(16.8, rollerCoaster.priceFor(visitor), 0.01);
    }
}
