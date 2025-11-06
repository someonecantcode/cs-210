/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: SuperSenior subclass extends Senior and uses its methods
 * 
 */


public class SuperSenior extends Senior {
    // discount is 0.5 as in 50% of the total value equating to 50% off.
    // if we want 30% off, we would write 0.7
    private static double discount = 0.5;
    private static String color = "White";

    // Slightly confusing. We are taking the senior's rate and halving it again
    // Essentially our super.BaseRate() * 0.25;
    @Override
    public double getFare() {

        // return super.getBaseRate() * this.discount (change to 0.25 ?);
        return super.getFare() * SuperSenior.discount;
    }

    @Override
    public String getColor() {
        return SuperSenior.color;
    }
}
