public class Adult extends BusFare {
    private static double discount = 1.0;
    private static String color = "Grey";

    @Override
    public double getFare() {
        return super.getBaseRate() * Adult.discount;
    }

    @Override
    public String getColor() {
        return Adult.color;
    }
}
