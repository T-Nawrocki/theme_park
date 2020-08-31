package attractions;

import behaviours.Security;
import people.Visitor;

public class Playground extends Attraction implements Security {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() < 16;
    }
}
