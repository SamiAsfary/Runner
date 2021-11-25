import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.floor;

public class Hero extends AnimatedThings{

    protected ArrayList<Integer> indexmax = new ArrayList<Integer>(Arrays.asList(6,2,6,2));

    public Hero(String imgPath, double setx, double sety) {
        super(imgPath, setx, sety, 8, 65, 75, 100, 4);
    }

    public void update(long time){
        this.setIndex((int) (time/75%this.indexmax.get(state)));
        this.updatephi(time);
        this.test();
    }

    private void updatephi(long time) {
        if(time%1 <= 0){
            if(y < 250 || vx != 0){
                ax+=0.01;
                vx = vx + ax;
                y = y + vx;
            }
            if(y>=250){
                y=250;
                vx = 0;
                ax = 0;
            }
            if(y==250) {
                state = 0;
            }else if(vx > 1){
                state = 1;
                index = 1;
            }else if(vx < 1){
                state = 1;
                index = 0;
            }
        }
    }

    public void jump() {
        vx = -10;
    }
}
