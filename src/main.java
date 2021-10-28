import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class main extends Application{

    public void start(Stage primaryStage){
        primaryStage.setTitle("Runner");
        staticThings sprite = new staticThings(20,10,65,100,"\\heros.png",200,300);
        /*Image spriteSheet = new Image("\\heros.png");
        ImageView sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20,300,65,100));
        sprite.setX(200);
        sprite.setY(300);*/
        Camera camtest = new Camera(500,0);
        Group root = new Group();
        root.getChildren().add(sprite.getSprite());
        GameScene scene = new GameScene(root, 800, 400,camtest);
        //root.getChildren().add(GameScene.left.getSprite());
        //root.getChildren().add(GameScene.right.getSprite());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }
}
