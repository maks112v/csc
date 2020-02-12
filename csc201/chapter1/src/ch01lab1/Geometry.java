package ch01lab1;

import java.util.Scanner;

/**
 * Calculate area and volume of shapes with length input
 * 2020/02/05
 *
 * @author Alex Hardy
 * @author Maksim Vakarchuk
 * @author Matt Nawton
 */
public class Geometry {
    private static Scanner scnr = new Scanner(System.in); // Create scnr for user input

    /**
     * Calls various methods and defines variables
     *
     * @param args unused
     */
    public static void main(String[] args) {
        double userLength; // user length
        double userWidth; // user width
        double userHeight; // user height
        double userDiameter; // user diameter

        userLength = getMeasurement(("length"));
        userWidth = getMeasurement(("width"));
        userHeight = getMeasurement(("height"));
        userDiameter = getMeasurement(("diameter"));

        displayInfo(userLength, userWidth, userHeight);
        displayInfo(userDiameter);

    }

    /**
     * Gets multiple user inputs
     *
     * @param description gets name of current required measurement
     * @return user input as double
     */
    public static double getMeasurement(String description) {
        System.out.print("Please enter a " + description + ": ");
        return scnr.nextDouble();
    }


    /**
     * calc area circle
     *
     * @param diameter user input for diameter
     * @return double of area
     */
    public static double calcArea(double diameter) {
        return Math.PI * Math.pow(diameter / 2, 2);
    }

    /**
     * calc area of square
     *
     * @param length user length
     * @param width  user width
     * @return double of area
     */
    public static double calcArea(double length, double width) {
        return length * width;
    }

    /**
     * calc sphere volume
     *
     * @param diameter user diameter
     * @return double of volume
     */
    public static double calcVolume(double diameter) {
        return (4.0 / 3.0) * Math.PI * Math.pow(diameter / 2, 3);
    }


    /**
     * calc box volume
     *
     * @param length user length
     * @param width  user width
     * @param height user height
     * @return double of volume
     */
    public static double calcVolume(double length, double width, double height) {
        return calcArea(length, width) * height;
    }

    /**
     * Calls and prints diameter calc
     *
     * @param diameter user diameter
     */
    public static void displayInfo(double diameter) {
        System.out.println("A circle with diameter " + diameter + " has an area of " + calcArea(diameter));
        System.out.println("A sphere with diameter " + diameter + " has a volume of " + calcVolume(diameter));

    }

    /**
     * Calls and prints box calc
     *
     * @param length user length
     * @param width  user width
     * @param height user height
     */
    public static void displayInfo(double length, double width, double height) {
        System.out.println("A " + length + " x " + width + " x " + height + " box has a volume of " + calcVolume(length, width, height));
    }

}
