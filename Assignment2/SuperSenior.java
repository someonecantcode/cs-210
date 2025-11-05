public class SuperSenior extends Senior {
    private static double discount = 0.5;
    private static String color = "white";

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
