public class v2myBusFare {

    public static void main(String[] args) {

        BusFare[] people = {
            new Adult(),
            new Senior(),
            new SuperSenior()
        };

        String[] names = {
            "Chloe",
            "Ted",
            "Ed"
        };

        for (int i = 0; i < people.length; i++) {
            people[i].fare(names[i]);
        }

    }
}
