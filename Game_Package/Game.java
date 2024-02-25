package Game_Package;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Map_Package.*;
import Player_Package.*;
import Vehicle_Package.*;
public class Game{

    //For now only 1 players, so we can make it static.
    static Player player = new Player();
    static int vehicleChoice;
    static boolean running =true;

    //List of vehicles to represent the AI
    static List<Vehicle> vehicles = new ArrayList<>();
    //How many other vehicles other than player. For instance, if set to 1, then 1 other vehicle plus current player = 2 mobile entites on the grid.
    int numberOfVehicles=1;
    public static void startGame(){
        //Show the map at the beginning of the game
        System.out.println("Initial state of the map ");
        Map.displayMap();

    }
    public static void initalizePlayer(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your vehicle " + "\n" + "1 : Car " + "\n" + "2 : Truck " + "\n" + "3 : Bus");
         vehicleChoice = scanner.nextInt();
        switch (vehicleChoice){
            case 1: System.out.println("You chose a Car");
            break;

            case 2: System.out.println("You chose a Truck");
            break;

            case 3: System.out.println("You chose a Bus");
            break;
            
            default: System.out.println("Invalid choice");
            break;
        }
        scanner.close();

    }
    public static void initalizeAI(){
    

        for(Vehicle vehicle: vehicles){
            
        }
    }
    public static void initalizeMap(){
    //Lets start off by creating our Map
    Map.createMap(10, 10);  // 10 rows, 10 cols
    }
   
    //Check if the player needs to make a decision.
    public static boolean decisionPoint(){
        //If value is a 2, we are at intersection. Ensure 1 car goes at a time.
        Position position =player.vehicle.getMovementStatus().getPosition();
        return position.getState()==2;
    }
    //If we are at a decision point for ex a intersection or a car nearby we should prompt player ot make a decision to avoid crash
    public static void promptPlayer(){
        Position position =player.vehicle.getMovementStatus().getPosition();
          
        
            System.out.println("Press L to check left, R to check right, and U to look ahead ");

            Scanner scanner = new Scanner(System.in);
            char c;
        System.out.println("Choose your vehicle " + "\n" + "1 : Car " + "\n" + "2 : Truck " + "\n" + "3 : Bus");
         c = scanner.next().charAt(0);
        switch (c){
            case 'L': {
                if(TrafficNetwork.checkLeft(position.getX(), position.getY()) ==-1) System.out.println("Out of bounds");
                else if(TrafficNetwork.checkLeft(position.getX(), position.getY()) ==0) System.out.println("Available");
                else if(TrafficNetwork.checkLeft(position.getX(), position.getY()) ==1) System.out.println("Unavailable");
                else if(TrafficNetwork.checkLeft(position.getX(), position.getY()) ==2) System.out.println("Intersection");
            }
            break;

            case 'R': {
                if(TrafficNetwork.checkRight(position.getX(), position.getY()) ==-1) System.out.println("Out of bounds");
                else if(TrafficNetwork.checkRight(position.getX(), position.getY()) ==0) System.out.println("Available");
                else if(TrafficNetwork.checkRight(position.getX(), position.getY()) ==1) System.out.println("Unavailable");
                else if(TrafficNetwork.checkRight(position.getX(), position.getY()) ==2) System.out.println("Intersection");
            }
            break;

            case 'U': {
                if(TrafficNetwork.checkUp(position.getX(), position.getY()) ==-1) System.out.println("Out of bounds");
                else if(TrafficNetwork.checkUp(position.getX(), position.getY()) ==0) System.out.println("Available");
                else if(TrafficNetwork.checkUp(position.getX(), position.getY()) ==1) System.out.println("Unavailable");
                else if(TrafficNetwork.checkUp(position.getX(), position.getY()) ==2) System.out.println("Intersection");
            }
            break;

            default: System.out.println("Invalid choice");
            break;

         
        }
            // update map. First mark segmenet we came from to available.
            Map.updateMap(position.getX(), position.getY(), 0);

            //make a move and update postion
            if(c=='L'){
                //Turn left
                System.out.println("Turning left");
                position.updatePosition(0, -1);        
            }
            else if(c=='R'){
                //Turn right
                System.out.println("Turning right");
                position.updatePosition(0, 1);
            }
            else if(c=='U'){
                //Go forward
                System.out.println("Going forward");
                position.updatePosition(-1, 0);
            }
            
            //check for crash or out of bounds
            
            if(position.invalid()){
                Game.endGame();
            }
            
            //Update map again to mark the cell to 1 as we are currnently on
                        
            Map.updateMap(position.getX(), position.getY(), 1);
             
            scanner.close();
        }
          
private static void updateGame(){

}
private static void endGame() {
        Game.running = false;
        System.out.println("The game has concluded");
        System.exit(0);
    }
public static void main(String args[]){
    Game.initalizeMap();
    Game.initalizePlayer();
    Game.startGame();

    while(Game.running){
        updateGame();
        //check for decision
        if(decisionPoint()){
            promptPlayer();
        }
        //display updated map
        Map.displayMap();
        
        //Time step
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
}