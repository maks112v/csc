package Boat;

/**
 * Boat Class
 * 2020/02/19
 * @author Alex Hardy
 * @author Maksim Vakarchuk
 * @author Matt Nawton
 */
public class Boat {
    private String name; // Name of this boat
    private String type; // Type of this boat
    private double length; // Length of this boat

    /**
     * Returns name of current boat instanc
     * @return string of boat name
     */
    public String getName(){
        return name;
    }

    /**
     * Sets name of current boat instance
     * @param boatName user input
     */
    public void setName(String boatName) {
        name = boatName;
    }

    /**
     * Returns type of current boat instance
     * @return string of boat type
     */
    public String getType(){
        return type;
    }

    /**
     * Sets type of current boat instance
     * @param boatType user input
     */
    public void setType(String boatType) {
        type = boatType;
    }

    /**
     * Returns length of current boat instance
     * @return double of boat length
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets length of current boat instance
     * @param boatLength user input
     */
    public void setLength(double boatLength) {
        length = boatLength;
    }

    /**
     * Returns string of current boats name, type, and length
     * @return string with info
     */
    public String getString() {
        return "Boat{name=" + getName() +", type=" + getType() + "', length=" + getLength() + "}";
    }
}
