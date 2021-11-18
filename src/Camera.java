public class Camera {

    private long x,y;

    public Camera(int xcoord,int ycoord){x = xcoord; y = ycoord;}

    public long getX() {return x;}

    public long getY() {return y;}

    @Override
    public String toString(){return("x coordinate = " + x + "\r\n" + "y coordinate = " + y);}
}
