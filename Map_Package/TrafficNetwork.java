// Handle the surroundsings of the traffic network
package Map_Package;
public class TrafficNetwork{
    public static int checkLeft(int x, int y){
        if(y - 1 < 0 || y -1 >=Map.cols) return -1; // out of bounds
        else if(Map.grid[x][y-1]==1) return 1; //Segment is occupied
        else if(Map.grid[x][y-1]==2) return 2; //Segment is a intersection
        else if(Map.grid[x][y-1]==0) return 0; //Segment is vacant
        else{
            return -1;
        }
    }
    public static int checkRight(int x, int y){
        if(y + 1 < 0 || y +1 >=Map.cols) return -1; // out of bounds
        else if(Map.grid[x][y+1]==1) return 1; //Segment is occupied
        else if(Map.grid[x][y+1]==2) return 2; //Segment is a intersection
        else if(Map.grid[x][y+1]==0) return 0; //Segment is vacant
        else{
            return -1;
        }
    }
     public static int checkUp(int x, int y){
        if(x + 1 < 0 || x +1 >=Map.rows) return -1; // out of bounds
        else if(Map.grid[x+1][y]==1) return 1; //Segment is occupied
        else if(Map.grid[x+1][y]==2) return 2; //Segment is a intersection
        else if(Map.grid[x+1][y]==0) return 0; //Segment is vacant
        else{
            return -1;
        }
    }
    public static int checkDown(int x, int y){
        if(x - 1 < 0 || x -1 >=Map.rows) return -1; // out of bounds
        else if(Map.grid[x-1][y]==1) return 1; //Segment is occupied
        else if(Map.grid[x-1][y]==2) return 2; //Segment is a intersection
        else if(Map.grid[x-1][y]==0) return 0; //Segment is vacant
        else{
            return -1;
        }
    }
}
