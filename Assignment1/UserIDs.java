/*
 * Name: Brendan Tea
 * Email: brendan.tea@bellevuecollege.edu
 * Date: October 31st, 2025
 * Description: Reads file data and allows users to add their user.
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

// gpt is not god -taesik kim
public class UserIDs {

    // Final variables that affect behavior across the program.
    static final int MIN_LENGTH = 5;
    static final int MAX_LENGTH = 11;
    static final File MAIN_FILE = new File("IDs.txt");

    static final String[] ERROR_LIST = {
            " is already in use. \n",
            " must be between " + MIN_LENGTH + " and " + MAX_LENGTH + ".\n",
            " must have at least one number. \n",
            " must have at least two special characters. \n",
            " must have lower-case and upper-case. \n",
            " must end with a special character. \n"
    };

    // Main method takes input from user and adds it to the file.
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> dataList = parseData(MAIN_FILE);
        listIds(MAIN_FILE);

        String input;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Create a new ID: ");
            input = s.next();
        } while (!metReqs(dataList, input));
        s.close();

        dataList.add(input);
        writeData(MAIN_FILE, dataList);
        listIds(MAIN_FILE);
    }

    // Reads data and loads them into an arrayList.
    public static ArrayList<String> parseData(File file) throws FileNotFoundException {
        ArrayList<String> dataList = new ArrayList<>();
        Scanner sFile = new Scanner(file);

        while (sFile.hasNext()) {
            dataList.add(sFile.next());
        }
        sFile.close();

        return dataList;
    }

    // Updates file with new data and checks if it was written.
    public static void writeData(File file, ArrayList<String> data) throws FileNotFoundException {
        PrintStream out = new PrintStream(MAIN_FILE);
        for (String s : data) {
            out.println(s);
        }
        out.close();

        // Checks data was written into database by checking if exists
        // could just use assert()

        if (!uniqueId(data, data.get(data.size() - 1))) {
            System.out.printf("%s created successfully! %n", data.get(data.size() - 1));
        } else {
            System.out.printf("ERROR");
        }
    }

    // Reads file data and outputs in console
    public static void listIds(File file) throws FileNotFoundException {
        Scanner sFile = new Scanner(file);
        String output = "";
        int count = 0;

        while (sFile.hasNext()) {
            output += sFile.next() + "\n";
            count++;
        }
        System.out.printf("List of IDs(%d) %n", count);
        System.out.println(output);
    }

    // Main checker function using all 7 requirements.
    public static boolean metReqs(ArrayList<String> list, String input) {

        String errorMessage = "";

        // a little redudant and confusing. In the future, error_list & checks should be
        // combined since elements
        // are in the same element.
        boolean[] checks = {
                uniqueId(list, input),
                inRange(input),
                oneNumber(input),
                twospecialChars(input),
                upperandlower(input),
                endSpecialchar(input),
        };

        for (int i = 0; i < checks.length; i++) {
            if (!checks[i]) {
                errorMessage += input + ERROR_LIST[i];
            }
        }
        System.out.println(errorMessage);
        return (errorMessage.length() == 0);
    }

    // O(n) lookup time. Checks every value and checks if it collides with the
    // input.
    public static boolean uniqueId(ArrayList<String> list, String id) {
        for (String ids : list) {
            if (ids.equals(id)) {
                return false;
            }
        }
        return true;
    }

    // O(1) Checks if input is within the range [MIN_LENGTH, MAX_LENGTH]
    public static boolean inRange(String input) {
        return (input.length() >= MIN_LENGTH && input.length() <= MAX_LENGTH);
    }

    // O(n) Checks if input has 1 number and exits immediately if found.
    public static boolean oneNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // O(n) Counts ammount of special chars and checks if greater or equal to 2.
    public static boolean twospecialChars(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetterOrDigit(input.charAt(i))) {
                count++;
            }

        }
        return count >= 2;
    }

    // O(n) Checks for both upper & lower by keeping check of both conditions.
    public static boolean upperandlower(String input) {
        boolean upper = false;
        boolean lower = false;

        for (int i = 0; i < input.length(); i++) {
            upper = upper || Character.isUpperCase(input.charAt(i));
            lower = lower || Character.isLowerCase(input.charAt(i));

            if (upper && lower) {
                return true;
            }
        }
        return false;

    }

    // O(1) Checks last char index and checks if it is special char.
    public static boolean endSpecialchar(String input) {
        return !Character.isLetterOrDigit(input.charAt(input.length() - 1));
    }

}
