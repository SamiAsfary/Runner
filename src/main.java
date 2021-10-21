import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application{

    public void start(Stage primaryStage){
        primaryStage.setTitle("Hello World !");
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400,true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}
