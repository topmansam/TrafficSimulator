package Game_Package;
import Map_Package.*;
import Player_Package.*;
import Vehicle_Package.*;
public class Game{

    //Lets create our player
    static Player player = new Player();
    
    public static void startGame(){

        //Lets start off by creating our Map
        Map.createMap(10, 10);  // 10 rows, 10 cols

        //Show the map at the beginning of the game
        System.out.println("Initial state of the map ");
        Map.displayMap();

    }
    //If we are at a decision point for ex a intersection or a car nearby we should prompt player ot make a decision to avoid crash
    public void promptPlayer(){
         //If value is a 2, we are at intersection. Ensure 1 car goes at a time.
        

    }
public static void main(String args[]){
    Game.startGame();

}
}