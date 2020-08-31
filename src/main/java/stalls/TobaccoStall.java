package stalls;

import behaviours.Security;
import people.Visitor;

public class TobaccoStall extends Stall implements Security {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 17;
    }
}
