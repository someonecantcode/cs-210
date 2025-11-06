import java.util.ArrayList;
import java.util.Arrays;



class person{
    int id;
    String name;
    int age;

    public person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public person(String string, BusFare senior) {
        //TODO Auto-generated constructor stub
    }

    public void output() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'output'");
    }
}

// BE ABLE TO EXPLAIN WHY SOMETHING IS INEFFICIENT LOGICALLY
public class notes {
  
    public static void main(String[] args) {
        ArrayList<person> myArray = new ArrayList<>();
        person p = new person(1032, "bill", 19);

        myArray.add(p);

        for (int i = 0; i < myArray.size(); i++) {
            System.out.printf("Index: %d. Name: %s %n", i, myArray.get(i).name);
        }

        for (person arrayinputs : myArray) {
            System.out.printf("Name: %s ID: %d Age: %d %n",  arrayinputs.name, arrayinputs.id, arrayinputs.age);
        }
    }

  

    static void example(){
        //Arrays are static datastructure.
        //ArrayLists are lists in which its size can be altered.
        // Arraylist<Object> var_name = new Arraylist<Object>();  (syntax candy can reduce it to Arraylist<>())
        // class object instead
        int maxStudent = 30;
        String[] id = new String[maxStudent];

        ArrayList<String> idList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        ageList.add(18);
        ageList.add(21);

        System.out.printf("Size: %d%n", ageList.size());
        System.out.printf("Get index 0: %d %n", ageList.get(0));

        for (int age : ageList) {
            System.out.println(age);
        }

        ageList.set(0, 67);
        ageList.remove(1);
    }

}