/*
 * Name: Brendan Tea
 * Date: October 31st, 2025
 * Description: super class busSystem class returning fares
 * 
 */

// super class has static private regFare and public getFare() method for instances
public class busSystem {
    private static double regFare = 5.0;

    public double getFare() {
        return busSystem.regFare;
    }
}