//This class will represent our position
package Vehicle_Package;
import Map_Package.*;
public class Position{
     private int x;
     private int y;
    public Position(int x, int y ){
        this.x = x;
        this.y = y;
    }
    public void updatePosition(int x, int y){
        this.x +=x;
        this.y +=y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
}
// This will check if we are currently in a vacant line segement, at an intersection, or crashed into somebody
public int getState(){
    return Map.grid[this.x][this.y];
} 
//If we are ever out of bounds or in a unavailable line segment end the game
public boolean invalid(){
    return this.x < 0 || this.x >=Map.rows || this.y < 0 || this.y >=Map.cols || Map.grid[this.x][this.y]==1;
}
}