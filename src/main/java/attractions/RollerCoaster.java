package attractions;

import behaviours.Security;
import people.Visitor;

public class RollerCoaster  extends Attraction implements Security {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 12 && visitor.getHeight() > 145;
    }
}
