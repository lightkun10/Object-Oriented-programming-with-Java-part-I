
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment otherApartment) {
        // price of an apartment: squareMeters * pricePerSquareMeter
        int thisApart = this.squareMeters * this.pricePerSquareMeter;
        int otherApart = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (thisApart < otherApart)
            return otherApart - thisApart;

        return thisApart - otherApart;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int thisApart = this.squareMeters * this.pricePerSquareMeter;
        int otherApart = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (thisApart > otherApart) {
            return true;
        }

        return false;
    }

}
