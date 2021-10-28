//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;

public class GameScene extends Scene {

    private staticThings left;
    private staticThings right;
    private Camera cam;

    public GameScene(Group parent, double v, double v1,Camera camtest) {
        super(parent, v, v1);
        this.cam = camtest;
        int xtest = this.cam.getX();
        int ytest = this.cam.getY();
        this.left = new staticThings(xtest%800,0,800,400, "\\desert.png",0,0);
        this.right = new staticThings(0,0,xtest%(800),400, "\\desert.png",800-xtest%800, 0);
        parent.getChildren().add(this.left.getSprite());
        parent.getChildren().add(this.right.getSprite());

    }


}
