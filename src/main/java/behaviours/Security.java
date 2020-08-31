package behaviours;

import people.Visitor;

public interface Security {

    boolean isAllowedTo(Visitor visitor);

}
