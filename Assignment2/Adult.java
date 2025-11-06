/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: Adult subclass with overriden methods
 * 
 */

public class Adult extends BusFare {

    // discount is 1 because there is no discount.
    private static double discount = 1.0;
    private static String color = "Red";

    // uses our super method and applies our class discount value.
    @Override
    public double getFare() {
        return super.getBaseRate() * Adult.discount;
    }

    @Override
    public String getColor() {
        return Adult.color;
    }
}
