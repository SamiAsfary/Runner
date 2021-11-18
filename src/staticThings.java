import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class staticThings {
    private double x, y;
    private ImageView sprite;

    public staticThings( String imgPath,int xpos, int ypos){
        this.x = xpos;
        this.y = ypos;
        Image spriteSheet = new Image(imgPath);
        this.sprite = new ImageView(spriteSheet);
        //this.sprite.setViewport(new Rectangle2D(xStart,yStart,xEnd-xStart,yEnd-yStart));
        this.sprite.setX( x );
        this.sprite.setY( y );
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ImageView getSprite() {
        return sprite;
    }

    public void update(long posx) {
        x = posx;
        this.sprite.setX( x );
    }
}
