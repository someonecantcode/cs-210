import java.util.Scanner;

class errorCheckStruct{
    boolean checker;
    String error_message;

    errorCheckStruct(boolean checker, String error_message){
        this.checker = checker;
        this.error_message = error_message;
    }   

    public void print(){
        System.out.printf(error_message, practice2.maxLength, practice2.mixLength);
    }
}

public class practice2 {
    public static int minLength, maxLength;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input min length of ID: ");
        minLength = s.nextInt();
        System.out.print("Input max length of ID: ");
        maxLength = s.nextInt();

        String id = "";
        while (!metReqs(id)) {
            System.out.print("\nCreate a new ID: ");
            id = s.next();
        }

        System.out.println(id + " has been successfully created!");
        s.close();
    }

    public static Boolean metReqs(String id) {
        Boolean output = true;

         if (isEmpty(id)) {
            return false;
        }

        errorCheckStruct[] checkers = {
            new errorCheckStruct(isInRange(id), "ID must be greater than or equal to %d and less than or equal to %d %n")
        };

       
        for(int i=0; checkers.length; i++){
            boolean yay = checkers[i].checker;
            if(!output) {
                checkers[i].print();
            }
        }

        if (id.length() < minLength || id.length() > maxLength) {
            System.out.printf("ID must be greater than or equal to %d and less than or equal to %d %n",
                    minLength,
                    maxLength);
            output = false;
        }

        if (id.charAt(0) != id.charAt(id.length() - 1)) {
            System.out.println("The first character and the last character must be the same");
            output = false;
        }

        return output;
    }

    public static boolean isEmpty(String id){
        return id.length() == 0;
    }
    public static Boolean isInRange(String id) {
        return (id.length() >= minLength && id.length() <= maxLength);
    }

}