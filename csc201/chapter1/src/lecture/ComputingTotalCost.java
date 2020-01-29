package lecture;
import java.util.Scanner;


public class ComputingTotalCost {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numDrinks;
        int numTacos;
        int totalCost;
        final int COST_OF_DRINK = 2;
        final int COST_PER_TACO = 3;


        numDrinks = scnr.nextInt();
        numTacos  = scnr.nextInt();

        /* Your solution goes here  */
        // A drink costs 2 dollars. A taco costs 3 dollars.
        // Given the number of each, compute total cost and assign totalCost with the result.
        totalCost = (numDrinks * COST_OF_DRINK) + (numTacos * COST_PER_TACO);

        System.out.print("Total cost: ");
        System.out.println(totalCost);
    }
}