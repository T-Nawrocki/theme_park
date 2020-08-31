import attractions.*;
import behaviours.Reviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;

    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private ArrayList<Attraction> attractions;

    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;
    private ArrayList<Stall> stalls;

    private Visitor visitor;

    @Before
    public void before() {
        dodgems = new Dodgems("Bumper Cars", 6);
        park = new Park("Green Space", 5);
        playground = new Playground("Kids' Area", 7);
        rollerCoaster = new RollerCoaster("Loopdey-loop", 8);

        attractions = new ArrayList<Attraction>() {{
            add(dodgems);
            add(park);
            add(playground);
            add(rollerCoaster);
        }};

        candyflossStall = new CandyflossStall(
                "Sweetshop",
                "A. Candyman",
                ParkingSpot.A1,
                10
        );
        iceCreamStall = new IceCreamStall(
                "ICE CREAM",
                "I. Screamseller",
                ParkingSpot.A2,
                5
        );
        tobaccoStall = new TobaccoStall(
                "Why Is This In A ThemePark?",
                "Shady Steve",
                ParkingSpot.A3,
                1
        );

        stalls = new ArrayList<Stall>() {{
            add(candyflossStall);
            add(iceCreamStall);
            add(tobaccoStall);
        }};

        themePark = new ThemePark("Altessington World of Thorpe Towers", attractions, stalls);

        visitor = new Visitor(27, 180, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Altessington World of Thorpe Towers", themePark.getName());
    }

    @Test
    public void hasAttractions() {
        assertEquals(attractions, themePark.getAttractions());
    }

    @Test
    public void hasStalls() {
        assertEquals(stalls, themePark.getStalls());
    }

    @Test
    public void canGetAllReviewedObjects() {
        ArrayList<Reviewed> expected = new ArrayList<Reviewed>() {{
            addAll(attractions);
            addAll(stalls);
        }};
        assertEquals(expected, themePark.getAllReviewed());
    }

    @Test
    public void visitorCanVisitAttraction() {
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
        assertEquals(new ArrayList<Attraction>(){{add(rollerCoaster);}}, visitor.getVisitedAttractions());
    }

}
