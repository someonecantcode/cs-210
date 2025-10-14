/*
 * Name: Brendan Tea
 * Date: October 9th, 2025
 * Description: Parsing big data.
 *  
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2 {
    //main function grabs gender and returns name and age.
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboardinput = new Scanner(System.in);
        Scanner fileinput = new Scanner(new File("member.txt"));
        

        String gender;
        
        do {
            System.out.print("Input Gender (f/m): ");
            gender = keyboardinput.next();

            if (isValidGender(gender)) {
                break;
            }
            System.out.println("Input again");
        } while (true);
        keyboardinput.close();

        int genderCount = 0;
        int ageSum = 0;
        System.out.printf("%nList of %s students %n", whatGender(gender));
        System.out.printf("%-10s %s %n", "name", "age");
        while(fileinput.hasNextLine()) {
            String nameString = fileinput.next();
            String mfString = fileinput.next();
            int age = fileinput.nextInt();

            if (mfString.equals(gender)){
                System.out.printf("%-10s %d %n", nameString, age);
                genderCount++;
                ageSum += age;
            }
        }
        fileinput.close();

        System.out.printf("%n%d Total %ss %n", genderCount, whatGender(gender));
        System.out.printf("Average age = %.1f", Average(ageSum, genderCount));
    }

   // returns if input is in the form m/f
    public static Boolean isValidGender(String gender){
        return (gender.toLowerCase().equals("f") || gender.toLowerCase().equals("m")) ;
    }

     // returns string gender full name
    public static String whatGender(String s){
        return s.toLowerCase().equals("f") ? "female" : "male";
    }

    // returns the average and checks for divide by 0 edgecase.
    public static Double Average(int sum, int count){
        return count == 0 ? 0 : (double) sum/count;
    }
}