package lecture;
import java.util.Scanner;

public class SphereVolumeCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double piVal = 3.14159;
        double sphereVolume;
        double sphereRadius;

        sphereRadius = scnr.nextDouble();

        /* Your solution goes here  */
        // Volume of sphere = (4.0 / 3.0) π r3 (Hint: r3 can be computed using *)
        sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);

        System.out.println(sphereVolume);
    }
}