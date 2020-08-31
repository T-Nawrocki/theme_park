package behaviours;

import people.Visitor;

public interface Ticketed {

    double defaultPrice();
    double priceFor(Visitor visitor);

}
