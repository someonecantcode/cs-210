public class q7 {

    // q7. 
    // C is the correct answer (3 POINTS)
    /*
     * a) The first character of newID is a letter
     * b) The newID conatains more than 2 letter.
     * c) NONE OF THE ABOVE
     * d) The second character of newID is a letter.
     */
    public static boolean check(String newid) {
        boolean valid = false;
        if ( Character.isLetter(newid.charAt(1))){
            valid = false; // doesnt change any state. 
        }

        return valid; // always return false regardless

    }
}