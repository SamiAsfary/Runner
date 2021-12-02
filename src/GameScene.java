import javafx.scene.Scene;
import javafx.scene.Group;
import java.util.ArrayList;

public class GameScene extends Scene {

    private staticThings left, right;
    private Hero nous;
    private Camera cam;
    private Group parent;
    private ArrayList<Foe> FoeList = new ArrayList();

    public final static int Dx = 400, Dy = 200;

    public GameScene(Group parent, double v, double v1,Camera camtest) {
        super(parent, v, v1);
        this.parent = parent;
        this.cam = camtest;
        int xtest = (int) this.cam.getX();
        int ytest = (int) this.cam.getY();
        this.left = new staticThings( "\\desert.png",0,0);
        this.right = new staticThings("\\desert.png",800-xtest%800, 0 );
        this.parent.getChildren().add(this.left.getSprite());
        this.parent.getChildren().add(this.right.getSprite());
        this.nous = new Hero("\\heros.png", 50, 250 );
        this.parent.getChildren().add(this.nous.getSprite());

        for(int i = 0; i<6;i++){
            Foe ennemie = new Foe("\\Blob.png", 700+i*800+((double) Math.random() * (100)), 310 );
            FoeList.add(ennemie);
            this.parent.getChildren().add(ennemie.getSprite());
        }

        this.setOnMouseClicked((event)->{
            System.out.println("Jump");
            nous.jump();
        });

    }

    public Hero getHero (){return nous;}

    public void update(long time){
        time = (time/1000/2048)%800;
        long leftx = -time, rightx = 800-time;
        this.left.update(leftx);
        this.right.update(rightx);
        nous.update(time);
        for (Foe ennemie : FoeList) {
            ennemie.update(time);

        }
        if(nous.IsHit(FoeList.get(0))){
            System.out.println("Hit");

        }

        if(FoeList.get(0).getx() <= -120){
            this.parent.getChildren().remove(FoeList.get(0).getSprite());
            FoeList.remove(0);
            Foe ennemie = new Foe("\\Blob.png", 700+5*800+((double) Math.random() * (100)), 310 );
            FoeList.add(ennemie);
            this.parent.getChildren().add(ennemie.getSprite());
        }

    }


}
