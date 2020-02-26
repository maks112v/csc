package Boat2;
import java.util.Scanner;

/**
 * Boat Init
 * 2020/02/19
 * @author Maksim Vakarchuk
 */
public class BoatMain {
    private static Scanner scnr = new Scanner(System.in); // User Input Scanner

    /**
     * Starts running boat main
     * @param args
     */
    public static void main(String[] args) {
        Boat boat1; // New Boat Instance
        Boat boat2; // New Boat Instance

        boat1 = getBoatData("#1");
        boat2 = getBoatData("#2");

        System.out.println(boat1.getString());
        System.out.println(boat2.getString());
    }


    public static Boat getBoatData(String label){
        String name;
        String type;
        double length;
        System.out.printf("Please enter the name of boat %s: ", label);
        name = scnr.nextLine(); // User input for boat 1 name
        System.out.printf("Please enter the type of boat %s: ", label);
        type = scnr.nextLine(); // User input for boat 1 type
        System.out.printf("Please enter the length of boat %s: ",label);
        length = scnr.nextDouble(); // User input for boat 1 length

        scnr.nextLine();

        return new Boat(name, type, length);
    }

}