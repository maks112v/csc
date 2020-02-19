package Boat;
import java.util.Scanner;

/**
 * Boat Init
 * 2020/02/19
 * @author Alex Hardy
 * @author Maksim Vakarchuk
 * @author Matt Nawton
 */
public class BoatMain {
    private static Scanner scnr = new Scanner(System.in); // User Input Scanner

    /**
     * Starts running boat main
     * @param args
     */
    public static void main(String[] args) {
        Boat boat1 = new Boat(); // New Boat Instance
        Boat boat2 = new Boat(); // New Boat Instance

        System.out.print("Please enter the name of boat #1: ");
        boat1.setName(scnr.nextLine()); // User input for boat 1 name
        System.out.print("Please enter the type of boat #1: ");
        boat1.setType(scnr.nextLine()); // User input for boat 1 type
        System.out.print("Please enter the length of boat #1: ");
        boat1.setLength(scnr.nextDouble()); // User input for boat 1 length

        scnr.nextLine();

        System.out.print("Please enter the name of boat #2: ");
        boat2.setName(scnr.nextLine()); // User input for boat 2 name
        System.out.print("Please enter the type of boat #2: ");
        boat2.setType(scnr.nextLine()); // User input for boat 2 type
        System.out.print("Please enter the length of boat #2: ");
        boat2.setLength(scnr.nextDouble()); // User input for boat 2 length

        System.out.println(boat1.getString());
        System.out.println(boat2.getString());
    }

}
