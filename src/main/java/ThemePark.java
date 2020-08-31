import attractions.Attraction;
import behaviours.Reviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name, ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.name = name;
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<Reviewed> getAllReviewed() {
        return new ArrayList<Reviewed>() {{
            addAll(attractions);
            addAll(stalls);
        }};
    }
}
