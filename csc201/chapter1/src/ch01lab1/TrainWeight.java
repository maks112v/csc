package ch01lab1;
import java.util.Scanner;

/**
 * 2020/01/29
 * @author Maksim Vakarchuk
 * @author Alex Hardy
 * @author Matt Nawton
 */

public class TrainWeight {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final double WEIGHT_PER_LOCOMOTIVE = 215537; // Weight of a single locomotive car
        final double WEIGHT_PER_TRAIN_CAR = 106000; // Weight of a single train car

        int numberOfEngines; // Init user input of locomotives
        int numberOfTrainCars; // Init user input of train cars
        String nameOfTrain; // Init user input of train name
        double totalWeight; // Init total weight of train

        System.out.print("Enter the number of engines for this train: ");
        numberOfEngines = scnr.nextInt(); // User input of locomotives
        System.out.print("Enter the number of cars for this train: ");
        numberOfTrainCars = scnr.nextInt(); // User input of train cars
        System.out.print("Enter the name of the train: ");
        nameOfTrain = scnr.next(); // User input of train name

        totalWeight = (WEIGHT_PER_LOCOMOTIVE * numberOfEngines) + (WEIGHT_PER_TRAIN_CAR * numberOfTrainCars); //
        System.out.println("The total empty weight of the " + nameOfTrain + " is: " + totalWeight ); // Print sentence with name and total weight
    }
}
