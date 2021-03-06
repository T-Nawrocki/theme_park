package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 7);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, tobaccoStall.getRating());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorOver18IsAllowed() {
        Visitor visitor = new Visitor(18, 150, 20);
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitorUnder18IsNotAllowed() {
        Visitor visitor = new Visitor(17, 150, 20);
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }
}
