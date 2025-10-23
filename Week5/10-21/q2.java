/*
 * Name: Brendan Tea
 * Date: October 20th, 2025
 * Description: Parses through data efficiently through person class.
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


//class object
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

public class q2 {
    // Main function sets up scanners, puts data into array and outputs it.
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sKeyboard = new Scanner(System.in);
        ArrayList<person> dataList = parseData();
        int input, count = 0;
        double avg;

        do {
            System.out.println("Select a subject 1. Math 2. Physics ");
            input = sKeyboard.nextInt();

        } while (!(input == 1 || input == 2));
        sKeyboard.close();

        avg = average(dataList, input);

        System.out.printf("\n%-8s %-15s %-15s \n", "Name", "Math Score", "Physic Score");
        System.out.println("---------------------------------------");

        String s = "";
        for (person p : dataList) {
            if ((isMath(input) ? p.MathScore : p.PhysicsScore) > avg) {
                s = "***";
                count++;
            }
            System.out.printf("%-8s %-15d %-15d %s\n", p.name, p.MathScore, p.PhysicsScore, s);
            s = "";
        }
        System.out.printf("%nNo. of Students = %d %nAverage of %s = %.1f", count, (isMath(input) ? "Math" : "Physic") ,avg);

    }

    // Parses data in score.txt and puts it into array.
    public static ArrayList<person> parseData() throws FileNotFoundException {
        Scanner sFiles = new Scanner(new File("score.txt"));
        ArrayList<person> output = new ArrayList<>();

        while (sFiles.hasNextLine()) {
            person p = new person(sFiles.next(), sFiles.nextInt(), sFiles.nextInt());
            output.add(p);
        }

        sFiles.close();
        return output;
    }

    // Simply averages out arraylist.
    public static double average(ArrayList<person> list, int input) {
        double avg = 0;
        boolean isMath = isMath(input);

        for (person p : list) {
            avg += isMath ? p.MathScore : p.PhysicsScore;
        }

        return avg / list.size();
    }

    // Converts input of 1 or 2 to tell if its Math or Physics.
    public static boolean isMath(int n) {
        return n == 1;
    }

}