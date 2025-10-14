import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboardinput = new Scanner(System.in);
        Scanner fileinput = new Scanner(new File("member.txt"));
        

        String gender;
        do {
            System.out.print("Input Gender: ");
            gender = keyboardinput.next();
        } while (!isValidGender(gender));
        keyboardinput.close();

        int genderCount = 0;
        while(fileinput.hasNextLine()) {
            String nameString = fileinput.next();
            String mfString = fileinput.next();
            int age = fileinput.nextInt();

            if (mfString.equals(gender)){
                System.out.printf("Name: %-10s Age: %d %n", nameString, age);
                genderCount++;
            }
        }
        fileinput.close();

        System.out.printf("%d Total %ss", genderCount, whatGender(gender));
    }

    public static Boolean isValidGender(String gender){
        return (gender.toLowerCase().equals("f") || gender.toLowerCase().equals("m")) ;
    }

    public static String whatGender(String s){
        return s.toLowerCase().equals("f") ? "female" : "male";
    }
}