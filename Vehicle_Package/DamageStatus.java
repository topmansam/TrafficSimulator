//This class will handle the damage aspect for the vehicle.
package Vehicle_Package;
import java.util.ArrayList;
public class DamageStatus{
    private double currentDamage;
    
    public DamageStatus(double currentDamage){
        this.currentDamage = currentDamage;
    }
    //Our setter essentially
    public void updateDamage(double damage){
        currentDamage-=damage;
    }
    public double getDamage(){
        return currentDamage;
    }
    
}