package stalls;

import behaviours.Security;
import people.Visitor;

public class TobaccoStall extends Stall implements Security {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 17;
    }
}
