/*
 * Name: Brendan Tea
 * Date: October 20th, 2025
 * Description: Prints out left and right aligned float
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

class person {
    String name;
    int MathScore;
    int PhysicsScore;

    public person(String nameinput, int mathinput, int physicinput) {
        this.name = nameinput;
        this.MathScore = mathinput;
        this.PhysicsScore = physicinput;
    }
}

public class p1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sKeyboard = new Scanner(System.in);
        ArrayList<person> dataList = parseData();
        int input, count = 0;
        double avg;

        do {
            System.out.print("\nSelect a sbuject 1. Math 2. Physics ");
            input = sKeyboard.nextInt();

        } while (!(input == 1 || input == 2));
        sKeyboard.close();

        avg = average(dataList, input);

        System.out.printf("\n%-8s %-15s %-15s \n", "Name", "Math Score", "Physic Score");
        System.out.println("---------------------------------------");
        for (person p : dataList) {
            if (p.MathScore > avg) {
                System.out.printf("%-8s %-15d %-15d\n", p.name, p.MathScore, p.PhysicsScore);
                count++;
            }
        }
        System.out.printf("%nNo. of Students = %d %nAverage of Math = %.1f", count, avg);

    }

    public static ArrayList<person> parseData() throws FileNotFoundException {
        Scanner sFiles = new Scanner(new File("score.txt"));
        ArrayList<person> output = new ArrayList<>();

        while (sFiles.hasNextLine()) {
            person p = new person(sFiles.next(), sFiles.nextInt(), sFiles.nextInt());
            System.out.print(p);
            output.add(p);
        }

        sFiles.close();
        return output;
    }

    public static double average(ArrayList<person> list, int input) {
        double avg = 0;
        boolean isMath = (input == 1);

        for (person p : list) {
            avg += isMath ? p.MathScore : p.PhysicsScore;
        }

        return avg / list.size();
    }

}