import java.util.ArrayList;
import java.util.Arrays;

public class Hero extends AnimatedThings{

    protected ArrayList<Integer> indexmax = new ArrayList<Integer>(Arrays.asList(6,2,6,2));
    private double invicibility=0;

    public Hero(String imgPath, double setx, double sety) {
        super(imgPath, setx, sety, 8, 65, 75, 100, 4);
    }

    public void update(long time){
        this.setIndex((int) (time/75%this.indexmax.get(state)));
        if(invicibility!=0){ invicibility--;}
        this.updatephi(time);
        this.test();
    }

    private void updatephi(long time) {
        if(time%1 <= 0){
            if(y < 250 || vy != 0){
                ay +=0.025;
                vy = vy + ay;
                y = y + vy;
            }
            if(y>=250){
                y=250;
                vy = 0;
                ay = 0;
            }
            if(y==250) {
                state = 0;
            }else if(vy > 1){
                state = 1;
                index = 1;
            }else if(vy < 1){
                state = 1;
                index = 0;
            }
        }
    }

    public boolean isInvicible(){
        if(invicibility == 0){
            return false;
        }else{
            return true;
        }
    }

    public boolean IsHit(Foe ennemie){
        if(this.intersect(ennemie) && !this.isInvicible()){
            invicibility = 100;
            return true;
        }else{
            return false;
        }
    }

    public void jump() {
        if(y==250) {
            vy = -10;
        }
    }
}
