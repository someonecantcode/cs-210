public class Senior extends BusFare {
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