package lecture;
import java.util.Scanner;


public class NameLettersCounter {
    private static Scanner scnr = new Scanner(System.in);


    public static int getAndCountNameLetters() {
        String name = "";
        if (scnr.hasNext()) {
            name = scnr.next();
        }
        return name.length();
    }

    public static void main(String[] args) {
        int firstNameLetterCount;
        int lastNameLetterCount;


        System.out.println("Enter a person's first and last names:");

        firstNameLetterCount = getAndCountNameLetters();
        lastNameLetterCount = getAndCountNameLetters();

        System.out.println("The first name has " + firstNameLetterCount + " letters.");
        System.out.println("The last name has " + lastNameLetterCount + " letters.");
    }
}
