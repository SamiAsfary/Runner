import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public abstract class AnimatedThings {

    protected double x,y;
    protected float vx = 0,ax = 0;
    private ImageView sprite;
    protected int state = 0,index = 0;
    private Image spriteSheet;
    private int statemax;
    protected ArrayList<Integer> indexmax;
    private int sizex, sizey;
    private int offsetx, offsety;

    public AnimatedThings(String imgPath, double setx, double sety, int offx, int offy, int fsizex,int fsizey, int statem){
        x = setx; y = sety; offsetx = offx; offsety = offy; statemax = statem; statemax = statem; sizex = fsizex; sizey = fsizey;

        this.spriteSheet = new Image(imgPath);
        this.sprite = new ImageView(spriteSheet);
        this.sprite.setViewport(new Rectangle2D(offsetx * (index+1) + index * sizex,(offsety + sizey) * state , sizex, sizey));
        this.sprite.setX(x);
        this.sprite.setY(y);
    }

    public void setIndex(int i){index = i;}

    public void test(){
        this.sprite.setViewport(new Rectangle2D(offsetx * (index+1) + index * sizex,(offsety + sizey) * state , sizex, sizey));
        this.sprite.setX(x);
        this.sprite.setY(y);
    }

    public ImageView getSprite(){return sprite;}

    public void setState(int newstate){state = newstate;}

}

