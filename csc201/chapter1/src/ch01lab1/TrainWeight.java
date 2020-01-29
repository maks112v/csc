package ch01lab1;
import java.util.Scanner;

public class TrainWeight {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final double WEIGHT_PER_LOCOMOTIVE = 215537;
        final double WEIGHT_PER_TRAIN_CAR = 106000;

        int numberOfEngines;
        int numberOfTrainCars;
        String nameOfTrain;
        double totalWeight;

        System.out.print("Enter the number of engines for this train: ");
        numberOfEngines = scnr.nextInt();
        System.out.print("Enter the number of cars for this train: ");
        numberOfTrainCars = scnr.nextInt();
        System.out.print("Enter the name of the train: ");
        nameOfTrain = scnr.next();

        totalWeight = (WEIGHT_PER_LOCOMOTIVE * numberOfEngines) + (WEIGHT_PER_TRAIN_CAR * numberOfTrainCars);
        System.out.println("The total empty weight of the " + nameOfTrain + " is: " + totalWeight );
    }
}
