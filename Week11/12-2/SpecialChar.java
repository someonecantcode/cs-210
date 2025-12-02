
public class SpecialChar {

//    public boolean digit(char c){
//        return Character.isDigit(c);
//    }
//
//    public boolean letter(char c){
//        return Character.isLetter(c);
//    }

    public boolean special(char c){
        return !Character.isLetterOrDigit(c);
    }
}