import java.util.ArrayList;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.File;

class person {
    String name;
    int MathScore;
    int PhysicsScore;

    public person(String nameinput,int mathinput, int physicinput) {
        this.name = nameinput;
        this.MathScore = mathinput;
        this.PhysicsScore = physicinput;
    }
}

public class testing {

    public static void main(String[] args) throws FileNotFoundException{   
        String s = "";
        System.out.print(s.length());
        parseData();
    }

     public static void parseData() throws FileNotFoundException {
        Scanner sFiles = new Scanner(new File("score.txt"));
        ArrayList<person> output = new ArrayList<>();

        while(sFiles.hasNextLine()){
            person p = new person(sFiles.next(), sFiles.nextInt(), sFiles.nextInt());
            output.add(p);
        }
        
        sFiles.close();
    }
}
