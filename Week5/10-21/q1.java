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

public class q1 {
    // Main function sets up scanners, puts data into array and outputs it.
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> mathList = new ArrayList<>();
        ArrayList<Integer> physicList = new ArrayList<>();

        int input, count = 0;
        double avg;

        Scanner sKeyboard = new Scanner(System.in);
        do {
            System.out.println("Select a subject 1. Math 2. Physics ");
            input = sKeyboard.nextInt();

        } while (!(input == 1 || input == 2));
        sKeyboard.close();

        Scanner sFiles = new Scanner(new File("score.txt"));
        while (sFiles.hasNextLine()) {
            nameList.add(sFiles.next());
            mathList.add(sFiles.nextInt());
            physicList.add(sFiles.nextInt());
        }
        sFiles.close();

        boolean isMath = (input == 1);
        avg = average(isMath ? mathList : physicList);

        System.out.printf("\n%-8s %-15s %-15s \n", "Name", "Math Score", "Physic Score");
        System.out.println("---------------------------------------");

        String s = "";
        for (int i = 0 ; i < nameList.size(); i++) {
            if (((isMath ? mathList.get(i) : physicList.get(i))) > avg) {
                s = "***";
                count++;
            }
            System.out.printf("%-8s %-15d %-15d %s\n", nameList.get(i), mathList.get(i), physicList.get(i), s);
            s = "";
        }
        System.out.printf("%nNo. of Students = %d %nAverage of %s = %.1f", count, (isMath ? "Math" : "Physic") ,avg);

    }

    // Simply averages out arraylist.
    public static double average(ArrayList<Integer> list) {
        double avg = 0;
        for (int a : list) {
            avg += a;
        }

        return avg / list.size();
    }

}