import java.util.*;

public class ArrayList_Add_Remove {

	static Scanner input = new Scanner(System.in);
	static ArrayList<String> id = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("ArrayList - add/remove test. CS210 Fall 2025\n");
		initialized();
		select();
	}

	public static void initialized() {
		id.add("a");
		id.add("b");
		id.add("c");
	}

	// MISSION 1: 1 point
	// show all the ids in the arrayList
	// for practice purpose, you must use size() method.

	public static void showList() {

		System.out.println("Current List:");

		for (int i = 0; i < id.size(); i++) {
			System.out.println(id.get(i));
		}

	}

	// end of MISSION 1

	public static void select() {

		showList();

		while (true) {

			try {

				System.out.println("Choose one: 1. add   2. remove   3. quit");
				int number = input.nextInt();

				if (number == 1) {
					addArray();

				} else if (number == 2) {
					removeArray();

				} else if (number == 3) {
					System.out.println("bye!");
					break;

				} else {
					System.out.println("you can only choose between 1 and 3 \n");
				}

			} catch (InputMismatchException e) {
				System.out.println("must input digit \n");
				input.nextLine();
			}
		}

	}

	// MISSION 2: 2 points
	// ask the user to input a new id
	// save the id in the arrayList (assuming there are no duplicates)
	// make sure the ID was successfully saved.
	// let the user know that the ID was successfully saved.
	// then, print all the ids again.

	public static void addArray() {

		System.out.println("input new ID");
		String newID = input.next();

		System.out.print(newID);
		System.out.println(id.add(newID) ? " was Saved!" : " WAS NOT SAVED");

		showList();
	}
	// end of MISSION 2

	// MISSION 3: 2 points
	// ask the user to input an id to remove.
	// just remove the id from the arrayList
	// check the ID was successfully removed.
	// let the user know that the ID was successfully removed or not.
	// if the ID was successfully removed, print all the ids again.

	public static void removeArray() {

		System.out.println("which ID do you want to remove?");
		String deleteID = input.next();

		System.out.print(deleteID);
		System.out.println(id.remove(deleteID) ? " WAS REMOVED!" : " WAS NOT REMOVED");

		showList();
	}
	// end of MISSION 3

}
