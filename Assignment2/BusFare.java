public abstract class BusFare {
    private static double baseRate = 5.0;
    private static String color = "Red";

    public abstract double getFare();

    public double getBaseRate() {
        return BusFare.baseRate;
    }

    public String getColor() {
        return BusFare.color;
    }

    public void fare(String name) {
        // %s for printing out the double leaves out the trailing zeros
        // 2.50 -> 2.5 and 1.2500 -> 1.25 :)
        System.out.printf("%s.fare() prints \"Fare: %s, Color: %s \" %n",
                name,
                this.getFare(),
                this.getColor());
    }

}