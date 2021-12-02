import java.util.ArrayList;
import java.util.Arrays;

public class Foe extends AnimatedThings{


    protected ArrayList<Integer> indexmax = new ArrayList<Integer>(Arrays.asList(8));

    public Foe(String imgPath, double setx, double sety) {
        super(imgPath, setx, sety, 29, 0, 119, 50, 1);
    }

    public void update(long time){
        this.setIndex((int) (time/50%this.indexmax.get(state)));
        x =x -5;
        this.test();
    }


}
