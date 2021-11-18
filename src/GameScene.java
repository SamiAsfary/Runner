import javafx.scene.Scene;
import javafx.scene.Group;

public class GameScene extends Scene {

    private staticThings left, right;
    private Hero nous;
    private Camera cam;
    public final static int Dx = 400, Dy = 200;

    public GameScene(Group parent, double v, double v1,Camera camtest) {
        super(parent, v, v1);
        this.cam = camtest;
        int xtest = (int) this.cam.getX();
        int ytest = (int) this.cam.getY();
        this.left = new staticThings( "\\desert.png",0,0);
        this.right = new staticThings("\\desert.png",800-xtest%800, 0 );
        parent.getChildren().add(this.left.getSprite());
        parent.getChildren().add(this.right.getSprite());
        this.nous = new Hero("\\heros.png", 50, 240 );
        parent.getChildren().add(this.nous.getSprite());
    }

    public Hero getHero (){return nous;}

    public void update(long time){
        time = (time/1000/2048)%800;
        long leftx = -time, rightx = 800-time;
        this.left.update(leftx);
        this.right.update(rightx);

    }


}
