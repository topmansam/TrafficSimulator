//Creates the map. Roads and Intersections. 1= Road segment is occupied. 0 = Road segment is vacant. 2 = Intersection. Initially, map will be initialized to all 0
// 1 1 0 0
// 0 0 2 0
// 0 0 0 0
// 0 0 1 1
package Map_Package;
public class Map{
    static int [][] grid;
    static int rows;
    static int cols;

// Array is automatically initalized to 0, but we should add the intersections.
public static void createMap(int rows, int cols){
    Map.rows = rows;
    Map.cols = cols;
    grid = new int [rows][cols];
    grid[0][0]=1; // Initially players start at (0,0)
    grid[rows/2][cols/2]=2; //create a intersection in the middle of the grid
    
    System.out.println("Initialized the map");
}
    
public static void updateMap(){
     System.out.println("Updating");
}

//Print current state of the map
public static void displayMap(){
    for(int i = 0; i <rows; i++){
        for(int j = 0; j < cols; j++){
            System.out.print(grid[i][j] + " ");
        }
        System.out.println();
    }
}
}