package attractions;

import behaviours.Ticketed;
import people.Visitor;

public class Dodgems extends Attraction implements Ticketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.5;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return visitor.getAge() < 12 ? defaultPrice() / 2 : defaultPrice();
    }
}
