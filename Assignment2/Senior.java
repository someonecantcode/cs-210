/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: Senior subclass extends BusFare and uses its methods
 * 
 */

public class Senior extends BusFare {
    // discount is 0.5 as in 50% of the total value equating to 50% off.
    // if we want 30% off, we would write 0.7
    private static double discount = 0.5;
    private static String color = "Grey"; 

    @Override
    public double getFare() {
        return super.getBaseRate() * Senior.discount;
    }

    @Override
    public String getColor() {
        return Senior.color;
    }
}