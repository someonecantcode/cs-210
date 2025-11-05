/*
 * Name: Brendan Tea
 * Date: October 31st, 2025
 * Description: subclass with overriden getfare
 * 
 */

// subclass extending busSystem inheriting the super methods.
public class senior extends busSystem {
    private static double discount = 0.5;

    @Override
    public double getFare() {
        return super.getFare() * senior.discount;
    }

    public void printFare() {
        System.out.printf("Fare: %.1f", this.getFare());
    }
}
