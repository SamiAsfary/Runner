public class Camera {

    private int x,y;

    public Camera(int xcoord,int ycoord){x = xcoord; y = ycoord;}

    public int getX() {return x;}

    public int getY() {return y;}

    @Override
    public String toString(){return("x coordinate = " + x + "\r\n" + "y coordinate = " + y);}
}
