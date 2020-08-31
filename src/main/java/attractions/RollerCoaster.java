package attractions;

import behaviours.Security;
import behaviours.Ticketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements Security, Ticketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 12 && visitor.getHeight() > 145;
    }

    @Override
    public double defaultPrice() {
        return 8.4;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return visitor.getHeight() > 200 ? defaultPrice() * 2 : defaultPrice();
    }
}
