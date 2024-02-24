//Car class that extends all our vehicle functionaly but also has number of doors field.
package Vehicle_Package;
public class Car extends Vehicle{
    private int numberOfDoors;
    // Initialize our Car with superclass
    public Car (String color, double size, double weight, double maxSpeed, Reputation reputation, 
DamageStatus damageStatus, MovementStatus movementStatus, int numberOfDoors ){
        super(color, size, weight, maxSpeed, reputation, damageStatus, movementStatus);
        this.numberOfDoors = numberOfDoors;
    }
   
}