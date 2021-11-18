import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.floor;

public class Hero extends AnimatedThings{

    protected ArrayList<Integer> indexmax = new ArrayList<Integer>(Arrays.asList(6,2,6,2));

    public Hero(String imgPath, double setx, double sety) {
        super(imgPath, setx, sety, 8, 0, 75, 100, 4);
    }

    public void update(long time){
        this.setIndex((int) ((time/1000/1000/100)%this.indexmax.get(state)));
        this.test();
    }
}
