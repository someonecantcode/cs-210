/*
 * Name: Brendan Tea
 * Email: brendan.tea@bellevuecollege.edu
 * Date: October 31st, 2025
 * Description: Reads file data and . . .
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Character;

// gpt is not god -taesik kim
public class UserId_working1 {
    static final int MIN_LENGTH = 5;
    static final int MAX_LENGTH = 11;
    static final File MAIN_FILE = new File("IDs.txt");

    static final String[] ERROR_LIST = {" is already in use. \n",
    " must be between " + MIN_LENGTH + " and " + MAX_LENGTH + ".\n", 
    " must have at least one number. \n",
    " must have at least two special characters. \n",
    " must have lower-case and upper-case. \n",
    " must end with a special character. \n"
    }; 

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

        System.out.println(input + " created successfully! \n");
        dataList.add(input);

        writeData(MAIN_FILE, dataList);
        listIds(MAIN_FILE);
    }


    public static ArrayList<String> parseData(File file) throws FileNotFoundException {
        ArrayList<String> dataList = new ArrayList<>();
        Scanner sFile = new Scanner(file);

        while (sFile.hasNext()) {
            dataList.add(sFile.next());
        }
        sFile.close();

        return dataList;
    }

    public static void writeData(File file, ArrayList<String> data) throws FileNotFoundException{
        PrintStream out = new PrintStream(MAIN_FILE);
        for(String s : data){
            out.println(s);
        }
        out.close();
    }

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

        // listIds(ArrayList<String> list)
        // for (String id : list) {
        // System.out.println(id);
        // }
    }

    public static boolean metReqs(ArrayList<String> list, String input) {
        String errorMessage = "";

        errorMessage += uniqueId(list, input) ? "" : (input + ERROR_LIST[0]) ;
        errorMessage += inRange(input) ? "" : (input + ERROR_LIST[1]) ;
        errorMessage += oneNumber(input) ? "" : (input + ERROR_LIST[2]) ;
        errorMessage += twospecialChars(input) ? "" : (input + ERROR_LIST[3]) ;
        errorMessage += upperandlower(input) ? "" : (input + ERROR_LIST[4]) ;
        errorMessage += endSpecialchar(input) ? "" : (input + ERROR_LIST[5]) ;

        System.out.println(errorMessage);
        return (errorMessage.length() == 0);
    }

    // O(n) lookup time
    public static boolean uniqueId(ArrayList<String> list, String id) {
        for (String ids : list) {
            if (ids.equals(id)) {
                return false;
            }
        }
        return true;
    }

    public static boolean inRange(String input) {
        return (input.length() >= MIN_LENGTH && input.length() <= MAX_LENGTH);
    }

    public static boolean oneNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean twospecialChars(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetterOrDigit(input.charAt(i))) {
                count++;
            }
        }
        return count >= 2;
    }

    public static boolean upperandlower(String input) {
        boolean upper = false;
        boolean lower = false;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                upper = true;
            }
            if(Character.isLowerCase(input.charAt(i))) {
                lower = true;
            }

            if (upper && lower) {
                return true;
            }
        }
        return false;

    }

    public static boolean endSpecialchar(String input){
        return !Character.isLetterOrDigit(input.charAt(input.length()-1));
    }

}