package Boat2;

/**
 * Boat Class
 * 2020/02/26
 * @author Maksim Vakarchuk
 */
public class Boat {
    private String name; // Name of this boat
    private String type; // Type of this boat
    private double length; // Length of this boat

    /**
     * no-arg constructor
     */
    public Boat(){
        this("", "", 0);
    }

    /**
     * Sets the boat values
     * @param name user input
     * @param type  user input
     * @param length  user input
     */
    public Boat(String name, String type, double length){
        setName(name);
        setType(type);
        setLength(length);
    }

    /**
     * Returns name of current boat instance
     * @return string of boat name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Sets name of current boat instance
     * @param boatName user input
     */
    public void setName(String boatName) {
        this.name = boatName;
    }

    /**
     * Returns type of current boat instance
     * @return string of boat type
     */
    public String getType(){
        return this.type;
    }

    /**
     * Sets type of current boat instance
     * @param boatType user input
     */
    public void setType(String boatType) {
        this.type = boatType;
    }

    /**
     * Returns length of current boat instance
     * @return double of boat length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Sets length of current boat instance
     * @param boatLength user input
     */
    public void setLength(double boatLength) {
        this.length = boatLength;
    }

    /**
     * Returns string of current boats name, type, and length
     * @return string with info
     */
    public String getString() {
        return "Boat{name=" + getName() +", type=" + getType() + ", length=" + getLength() + "}";
    }
}
