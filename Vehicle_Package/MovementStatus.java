//Handle the position, direction, and speed of the vehicle.
package Vehicle_Package;
public class MovementStatus{
    private Position position;
    private double speed;
    public MovementStatus(Position position, double speed){
        this.position = position;
        this.speed = speed;
    }
    public Position getPosition(){
        return position;
    }
    public double getSpeed(){
        return this.speed;
    }
    
}
