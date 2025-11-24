import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Add_Remove {

	static Scanner input = new Scanner(System.in);

	// MISSION 1:
	// Create a static LinkedList
	// the instance name must be id

	static LinkedList<String> id = new LinkedList<>();

	// end of MISSION 1

	public static void main(String[] args) {

		System.out.println("LinkedList - add/remove test. CS210 Fall 2025\n");
		initialized();
		select();
	}

	public static void initialized() {
		id.add("a");
		id.add("b");
		id.add("c");
		id.add("b");
	}

	// MISSION 2:

	// show all the ids in the LinkedList
	// for practice purpose, you must use size() method.

	public static void showList() {

		System.out.println("Current List:");

		// n^2 printing time

		// would just use a list node or iterator
		Iterator<String> it = id.iterator();	

		for (int i = 0; i < id.size(); i++) {
			System.out.println(it.next());
		}

	}

	// end of MISSION 2

	public static void select() {

		showList();

		while (true) {

			try {

				System.out.println("Choose one: 1. add   2. remove   3. quit");
				int number = input.nextInt();

				if (number == 1) {
					addLinkedList();

				} else if (number == 2) {
					removeLinkedList();

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

	// MISSION 3:

	// ask the user to input a new id
	// save the id in the LikedList (assuming there are no duplicates -> don't need
	// to check)
	// make sure the ID was successfully saved.
	// let the user know that the ID was successfully saved.
	// then, print all the ids again.

	public static void addLinkedList() {

		System.out.println("input new ID");
		String newID = input.next();

		System.out.println(id.add(newID) ? "Saved" : "NOT SAVED");
		showList();
	}
	// end of MISSION 3

	// MISSION 4:

	// ask the user to input an id to remove.
	// just remove the id from the LinkedList
	// check the ID was successfully removed.
	// let the user know that the ID was successfully removed or not.
	// if the ID was successfully removed, print all the ids again.

	public static void removeLinkedList() {

		System.out.println("which ID do you want to remove?");
		String deleteID = input.next();

		System.out.println(id.remove(deleteID) ? "Removed" : "NOT Removed");
		showList();
	}
	// end of MISSION 4
}
