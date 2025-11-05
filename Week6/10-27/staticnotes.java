class ExchangeRate {
    public double peso = 10.0;
    public static double usd = 1.0;

    public ExchangeRate(double p, double u) {
        this.peso = p;
        ExchangeRate.usd = u;
    }

}

public class staticnotes {
    public static void main(String[] args) {
        ExchangeRate hotel = new ExchangeRate(2, 1.1);
        ExchangeRate airplane = new ExchangeRate(1, 1); 

        staticnotes n = new staticnotes();
        n.displayObject(hotel);
        n.displayObject(airplane);
    }

    public void displayObject(ExchangeRate eRate){
        System.out.printf("Peso: %.1f %n", eRate.peso);
        System.out.printf("USD: %.1f %n", ExchangeRate.usd);
    }
}
