//Truck class that extends all our vehicle functionaly but also has cargo
package Vehicle_Package;
public class Truck extends Vehicle{
    private double cargo;
    public Truck (String color, double size, double weight, double maxSpeed, Reputation reputation, 
DamageStatus damageStatus, MovementStatus movementStatus, double cargo ){
    super(color, size, weight, maxSpeed, reputation, damageStatus, movementStatus);
    this.cargo = cargo;
}
}