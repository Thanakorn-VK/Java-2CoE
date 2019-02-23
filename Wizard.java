import java.io.*;
import java.util.*;

public class Wizard extends Novice
{   
    public void setWizard(int hp,int exp,int level){
        super.setHP(hp-200);
        super.setEXP(exp);
        super.setLEVEL(level);
    }
    public void MeteorStorm(){
        super.changeHP(40);
        super.changeEXP(3);
    }
}