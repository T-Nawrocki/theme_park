package attractions;

import behaviours.Reviewed;

public abstract class Attraction implements Reviewed {
    private String name;
    private int rating;
    private int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
