package ch01lab1;
import java.util.Scanner;

/**
 * Calculate area and volume of shapes with length input
 * 2020/02/05
 * @author Alex Hardy
 * @author Maksim Vakarchuk
 * @author Matt Nawton
 */
public class GeometryCalc {

    /**
     * Calls various methods and defines variables
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double inputLength; // inputLength Init

        System.out.print("Please enter a length: ");
        inputLength = scnr.nextInt(); // Get user input for inputLength

        // execute areas function
        displayAreas(inputLength, calcSquareArea(inputLength), calcCircleArea((inputLength)));

        // execute volumes function
        displayVolumes(inputLength, calcCubeVolume(inputLength), calcSphereVolume((inputLength)));
    }

    /**
     * calc square area
     * @param side user length input
     * @return square area
     */
    public static double calcSquareArea(double side) {
        return Math.pow(side, 2);
    }

    /**
     * calc circle area
     * @param diameter user length input
     * @return circle area
     */
    public static double calcCircleArea(double diameter) {
        return Math.PI * Math.pow(diameter, 2);
    }

    /**
     * print areas
     * @param length user length input
     * @param squareArea result from calcSquareArea
     * @param circleArea result from calcCircleArea
     */
    public static void displayAreas(double length, double squareArea, double circleArea) {
        System.out.println("A square with side " + length + " has an area of " + squareArea);
        System.out.println("A circle with diameter " + length + " has an area of " + circleArea);
    }

    /**
     * calc cube volume
     * @param length user length input
     * @return cube volume
     */
    public static double calcCubeVolume(double length) {
        return Math.pow(length, 3);
    }

    /**
     * calc circle volume
     * @param diameter user length input
     * @return circle volume
     */
    public static double calcSphereVolume(double diameter) {
        return (4.0 / 3.0) * Math.PI * Math.pow(diameter / 2 , 3);
    }

    /**
     * print volumes
     * @param length user length input
     * @param cubeVolume result from calcCubeVolume
     * @param sphereVolume result from calcSphereVolume
     */
    public static void displayVolumes(double length, double cubeVolume, double sphereVolume) {
        System.out.println("A cube with side " + length + " has a volume of " + cubeVolume);
        System.out.println("A sphere with diameter " + length + " has a volume of " + sphereVolume);
    }
}

