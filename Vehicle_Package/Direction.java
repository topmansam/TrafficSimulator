package Vehicle_Package;
public enum Direction{
    // our 4 direction vectors
    NORTH(-1,0),
    SOUTH(1,0),
    WEST(0,-1),
    EAST(0,1);

    private final int x;
    private final int y;

     Direction(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}