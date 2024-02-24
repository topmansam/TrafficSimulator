package Player_Package;
import Vehicle_Package.*;
public class Player{
    int reputation;
    Car car;
    int damage;
    int position [][];
    public Player(int reputation, Car car, int damage, int position[][]){
        this.reputation = reputation;
        this.car = car;
        this.damage=damage;
        this.position = position;
    }
}