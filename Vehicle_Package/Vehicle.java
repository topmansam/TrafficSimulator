package Vehicle_Package;
public abstract class Vehicle {
    //These fields can be private because our getters and setters are public. 
    private String color;
    private double size;
    private double weight;
    private double maxSpeed;
    private Reputation reputation;
    private DamageStatus damageStatus;
    private MovementStatus movementStatus;

//Constructor to initialize our fields for us.
public Vehicle (String color, double size, double weight, double maxSpeed, Reputation reputation, 
DamageStatus damageStatus, MovementStatus movementStatus ){
    this.color = color;
    this.size = size;
    this.weight = weight;
    this.maxSpeed = maxSpeed;
    this.reputation = reputation;
    this.damageStatus = damageStatus;
    this.movementStatus = movementStatus;
}
    //setters in case we want to change something
    public void setColor(String color){
        this.color = color;
    }
    public void setSize(double size){
        this.size = size;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setReputation(Reputation reputation){
        this.reputation = reputation;
    }
    public void setDamageStatus(DamageStatus damageStatus){
        this.damageStatus = damageStatus;
    }
    public void setMovementStatus(MovementStatus movementStatus){
        this.movementStatus=movementStatus;
    }

    public void move(){
        System.out.println("Moving");
    }

    //getters
    public String getColor(){
        return color;
    }
    public double getSize(){
        return size;
    }
    public double getWeight(){
        return weight;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public Reputation getReputation(){
        return reputation;
    }
    public DamageStatus getDamageStatus(){
        return damageStatus;
    }
    public MovementStatus getMovementStatus(){
        return movementStatus;
    }
}
