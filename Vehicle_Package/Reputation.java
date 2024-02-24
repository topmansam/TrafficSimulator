/*
This class will store hte reputation and its history for each vehicle. 
Each vehicle current reputation will be determined by its current nicencess.
*/
package Vehicle_Package;
import java.util.List;
import java.util.ArrayList;
public class Reputation{
    private double nicencess;
    public List<Double> reputationHistory;
    
    public Reputation(double nicencess){
        this.nicencess = nicencess;
        reputationHistory = new ArrayList<>();
    }

}